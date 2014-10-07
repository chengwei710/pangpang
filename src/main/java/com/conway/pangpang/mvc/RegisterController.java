package com.conway.pangpang.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.repo.UserDao;
import com.conway.pangpang.utils.MD5Utils;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	public static final String PAGE_REGISTER = "sign_up";
	public static final String PAGE_REGISTER_SUCC = "register_success";
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		model.addAttribute("register", new User());
		return PAGE_REGISTER;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String quickRegister(
			@Valid @ModelAttribute("register") User register,
			BindingResult result) throws Exception {
		if(result.hasErrors()){
			return PAGE_REGISTER;
		}
		
		String password = register.getPassword();
		if(!password.equals(register.getRePassword())){
			return PAGE_REGISTER;
		}
		
		User user = userDao.getLoginInfoByName(register.getUserName());
		if(user != null){
			return PAGE_REGISTER;
		}
		
		user = new User();
		user.setUserName(register.getUserName());
		user.setPassword(MD5Utils.encode(password));
		userDao.register(user);
		
		return PAGE_REGISTER_SUCC;
	}

}
