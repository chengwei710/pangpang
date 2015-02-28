package com.conway.pangpang.mvc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conway.pangpang.domain.Module;
import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.ModuleDao;

@Controller
@RequestMapping(value="/module")
public class ModuleController {
	
	public static final String ACTION_REDIRECT = "redirect:/";
	public static final String PAGE_LOGIN = "login";
	private static final String PAGE_MODULE = "module_list";
	
	@Autowired
	private ModuleDao moduleDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(HttpSession session, Model model){
		
		User user = (User) session.getAttribute("CurrentUser");
		if (user == null) {
			return ACTION_REDIRECT + PAGE_LOGIN;
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
		model.addAttribute(menuTree);
		return PAGE_MODULE;
	}
	
	public String addModule(Model model){
		return null;
		
	}
	
	public String removeModule(){
		
		return null;
	}
	
	private void listAllChildrenModule(List<Module> modules, Module module,
			List<Long> userModuleIds) {

		SortedSet<Module> menuTree = new TreeSet<Module>(new ModuleComparator());

		for (Module mod : modules) {
			if (module.getModuleId().equals(mod.getParentId()) 
					&& userModuleIds.contains(mod.getModuleId())) {
				menuTree.add(mod);
				if (!mod.isLEAF()) {
					listAllChildrenModule(modules, module, userModuleIds);
				}
			}
		}
		module.setChildModules(new ArrayList<Module>(menuTree));
	}
	
	class ModuleComparator implements Comparator<Module>{
		@Override
		public int compare(Module o1, Module o2) {
			return o1.getListOrder().compareTo(o2.getListOrder());
		}
	}
}
