package com.conway.pangpang.controller;

import java.sql.Timestamp;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.UserDao;
import com.conway.pangpang.support.constants.CachedPropertyNameDefine;
import com.conway.pangpang.support.constants.DecisionConstants;
import com.conway.pangpang.support.constants.PageNameDefine;
import com.conway.pangpang.support.constants.RequestPathDefine;
import com.conway.pangpang.utils.MD5Utils;

@Controller
@RequestMapping(value="/login")
public class LoginController {
		
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		model.addAttribute("login", new User());
		return PageNameDefine.PAGE_LOGIN;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("login") User login, BindingResult result,
			HttpServletRequest request, HttpSession session) throws Exception {

		if(result.hasErrors()){
			return PageNameDefine.PAGE_LOGIN;
		}
		String userName = login.getUserName();
		String password = login.getPassword();
		
		User user = userDao.getLoginInfoByName(userName);
		if(user != null){
			//whether the user disabled
			if(DecisionConstants.FLAG_YES.equals(user.getDisabled())){
				result.reject(null, "");
				return PageNameDefine.PAGE_LOGIN;
			}
			//compare the password
			if(!MD5Utils.encode(password).equals(user.getPassword())){
				int loginTimes = user.getLoginTimes() + 1;
				user.setLoginTimes(loginTimes);
				if(loginTimes >= 5){
					login.setDisabled(DecisionConstants.FLAG_YES);
				}
				userDao.updateLoginInfo(user);
				
				result.rejectValue("password", null, "");
				return PageNameDefine.PAGE_LOGIN;
			}
			user.setLastLoginIp(getIpAddr(request));
			user.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
			user.setLoginTimes(0);
			userDao.updateLoginInfo(user);
			
			if(DecisionConstants.FLAG_YES.equals(user.getNeedChangePwd())){
				return PageNameDefine.PAGE_RESET_PASSWORD;
			}

			session.setAttribute(CachedPropertyNameDefine.CURRENT_USER_IN_SESSION, user);
			
			return redirectTo(PageNameDefine.PAGE_HOME);
		}else{
			//user does not exist
			result.rejectValue("userName", null, "");
			return PageNameDefine.PAGE_LOGIN;
		}
	}
	
	private String redirectTo(String pageHome) {
		return RequestPathDefine.ACTION_REDIRECT + pageHome;
	}

	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
