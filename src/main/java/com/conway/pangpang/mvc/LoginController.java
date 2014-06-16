package com.conway.pangpang.mvc;

import java.sql.Timestamp;

import javax.validation.Valid;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.UserDao;
import com.conway.pangpang.utils.MD5Utils;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	public static final String ACTION_REDIRECT = "redirect:/";
	public static final String PAGE_LOGIN = "login";
	public static final String PAGE_HOME = "home";
	public static final String PAGE_RESET_PASSWORD = "rest_password";
	
	public static final String FLAG_YES = "Y";
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		model.addAttribute("user", new User());
		return PAGE_LOGIN;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String login(@Valid User user, BindingResult result,
			HttpServletRequest request) throws Exception {

		if(result.hasErrors()){
			return PAGE_LOGIN;
		}
		String userName = user.getUserName();
		String password = user.getPassword();
		
		User login = userDao.getLoginInfoByName(userName);
		if(login != null){
			//whether the user disabled
			if(FLAG_YES.equals(login.getDisabled())){
				result.reject(null, "");
				return PAGE_LOGIN;
			}
			//compare the password
			if(!MD5Utils.encode(password).equals(login.getPassword())){
				int loginTimes = login.getLoginTimes() + 1;
				login.setLoginTimes(loginTimes);
				if(loginTimes >= 5){
					login.setDisabled(FLAG_YES);
				}
				userDao.updateLoginInfo(login);
				
				result.rejectValue("user.password", null, "");
				return PAGE_LOGIN;
			}
			login.setLastLoginIp(getIpAddr(request));
			login.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
			login.setLoginTimes(0);
			userDao.updateLoginInfo(login);
			
			if(FLAG_YES.equals(login.getNeedChangePwd())){
				return PAGE_RESET_PASSWORD;
			}

			return ACTION_REDIRECT + PAGE_HOME;
		}else{
			//user does not exist
			result.rejectValue("user.userName", null, "");
			return PAGE_LOGIN;
		}
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
