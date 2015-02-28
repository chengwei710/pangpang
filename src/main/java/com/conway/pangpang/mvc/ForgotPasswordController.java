package com.conway.pangpang.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/findPassword")
public class ForgotPasswordController {

	private static final String PAGE_FIND_PASSWORD = "forgot_password";

	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		return PAGE_FIND_PASSWORD;
	}
	
	@RequestMapping(value="/requestParam", method=RequestMethod.GET)
	public String retrievePassword(@RequestParam(value="email")String email){
		
		
		return null;
	}
	
}
