package com.conway.pangpang.mvc;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.UserDao;
import com.conway.pangpang.utils.MD5Utils;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	public static final String ACTION_REDIRECT = "redirect:/";
	public static final String PAGE_LOGIN = "sign_in";
	public static final String PAGE_HOME = "home";
	public static final String PAGE_RESET_PASSWORD = "rest_password";
	
	public static final String FLAG_YES = "Y";
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		model.addAttribute("login", new User());
		return PAGE_LOGIN;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("login") User login, BindingResult result,
			HttpServletRequest request, HttpSession session) throws Exception {

		if(result.hasErrors()){
			return PAGE_LOGIN;
		}
		String userName = login.getUserName();
		String password = login.getPassword();
		
		User user = userDao.getLoginInfoByName(userName);
		if(user != null){
			//whether the user disabled
			if(FLAG_YES.equals(user.getDisabled())){
				result.reject(null, "");
				return PAGE_LOGIN;
			}
			//compare the password
			if(!MD5Utils.encode(password).equals(user.getPassword())){
				int loginTimes = user.getLoginTimes() + 1;
				user.setLoginTimes(loginTimes);
				if(loginTimes >= 5){
					login.setDisabled(FLAG_YES);
				}
				userDao.updateLoginInfo(user);
				
				result.rejectValue("password", null, "");
				return PAGE_LOGIN;
			}
			user.setLastLoginIp(getIpAddr(request));
			user.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
			user.setLoginTimes(0);
			userDao.updateLoginInfo(user);
			
			if(FLAG_YES.equals(user.getNeedChangePwd())){
				return PAGE_RESET_PASSWORD;
			}

			session.setAttribute("CurrentUser", user);
			
			return ACTION_REDIRECT + PAGE_HOME;
		}else{
			//user does not exist
			result.rejectValue("userName", null, "");
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
