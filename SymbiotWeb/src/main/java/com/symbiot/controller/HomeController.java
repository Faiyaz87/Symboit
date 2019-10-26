package com.symbiot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.symbiot.entity.Login;
import com.symbiot.entity.User;
import com.symbiot.service.IUserService;

@Controller
public class HomeController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "dashboard";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginPage";
	}
	
	@RequestMapping("/logout-success")
	public String logout() {
		return "logout";
	}

}
