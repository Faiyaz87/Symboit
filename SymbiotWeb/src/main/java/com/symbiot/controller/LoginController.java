package com.symbiot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.symbiot.entity.Login;
import com.symbiot.entity.User;
import com.symbiot.service.IUserService;

@Controller
public class LoginController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Model model,Login login) {
		User userDtls = userService.getUserByLogin(login.getUsername());
		System.out.println("userDtls : "+userDtls.toString());
		return "login";
	}

}
