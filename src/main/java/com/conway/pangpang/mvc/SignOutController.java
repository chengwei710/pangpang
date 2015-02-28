package com.conway.pangpang.mvc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/signOut")
public class SignOutController {

	public static final String ACTION_REDIRECT = "redirect:/";
	public static final String PAGE_LOGIN = "login";
	
	@RequestMapping(method=RequestMethod.GET)
	public String display(HttpSession session){
		if(session != null){
			session.invalidate();
		}

		return ACTION_REDIRECT + PAGE_LOGIN;
	}
}
