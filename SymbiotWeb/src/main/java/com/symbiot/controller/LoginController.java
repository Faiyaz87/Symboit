package com.symbiot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message","Hi thios if from controller");
		return "login";
	}

}
