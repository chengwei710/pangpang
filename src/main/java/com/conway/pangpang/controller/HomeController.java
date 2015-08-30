package com.conway.pangpang.controller;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conway.pangpang.domain.Module;
import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.ModuleDao;
import com.conway.pangpang.support.constants.CachedPropertyNameDefine;
import com.conway.pangpang.support.constants.RequestPathDefine;

@Controller
@RequestMapping(value="/home")
public class HomeController {	
	
	@Autowired
	private ModuleDao moduleDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String display(HttpSession session) throws Exception {

		User user = (User) session.getAttribute(CachedPropertyNameDefine.CURRENT_USER_IN_SESSION);
		if (user == null) {
			return redirectTo(RequestPathDefine.ACTION_PATH_LOGIN);
		}
		List<Long> userModuleIds = moduleDao.listUserAccessableModuleIds(user
				.getUserName());

		// load all system module
		SortedSet<Module> menuTree = new TreeSet<Module>(new ModuleComparator());
		List<Module> modules = moduleDao.listAllSystemModules();
		for (Module module : modules) {
			if (module.getParentId() == null
					&& userModuleIds.contains(module.getModuleId())) {
				menuTree.add(module);
				listAllChildrenModule(modules, module, userModuleIds);
			}
		}
		
		session.setAttribute(CachedPropertyNameDefine.CACHED_MAIN_MENU, generateJsonString(menuTree));
		
		return RequestPathDefine.ACTION_PATH_HOME;
	}

	private String generateJsonString(Object menuTree)
			throws Exception {
		
		StringWriter mainMenu = new StringWriter();
		JsonGenerator jsonGen = null;
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			jsonGen = objectMapper.getJsonFactory().createJsonGenerator(mainMenu);
			jsonGen.writeObject(menuTree);
			jsonGen.flush();
		}finally{
			if(jsonGen != null && !jsonGen.isClosed()){
				jsonGen.close();
			}
		}
		return mainMenu.toString();
	}

	private void listAllChildrenModule(List<Module> modules, Module module,
			List<Long> userModuleIds) {

		SortedSet<Module> menuTree = new TreeSet<Module>(new ModuleComparator());

		for (Module mod : modules) {
			if (module.getModuleId().equals(mod.getParentId()) 
					&& userModuleIds.contains(mod.getModuleId())) {
				menuTree.add(mod);
				if (!mod.isLEAF()) {
					listAllChildrenModule(modules, mod, userModuleIds);
				}
			}
		}
		module.setChildModules(new ArrayList<Module>(menuTree));
	}
	
	private String redirectTo(String pageHome) {
		return RequestPathDefine.ACTION_REDIRECT + pageHome;
	}
	
	class ModuleComparator implements Comparator<Module>{
		@Override
		public int compare(Module o1, Module o2) {
			return o1.getListOrder().compareTo(o2.getListOrder());
		}
	}
}
