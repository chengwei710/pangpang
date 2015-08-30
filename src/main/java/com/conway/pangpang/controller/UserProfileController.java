package com.conway.pangpang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/userProfile")
public class UserProfileController {

	public static final String PAGE_USER_PROFILE = "user_profile";
	@RequestMapping(method=RequestMethod.GET)
	public String display(Model model){
		
		
		return PAGE_USER_PROFILE;
	}
}
