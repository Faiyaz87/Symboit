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
public class LoginController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/")
	public String index(Model model) {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Model model,Login login) {
		List<User> userDtlList = userService.getUserByLogin(login.getUsername());
		if (userDtlList != null && userDtlList.size() == 1) {
			User usrObj = userDtlList.get(0);
			if (usrObj.getPassword().equals(login.getPassword())) {
				model.addAttribute("USR_OBJ", usrObj);
				return "dashboard";
			}else {
				model.addAttribute("MSG", "Incorrect username or password.");
				return "login";
			}
		}else {
			model.addAttribute("MSG", "Incorrect username or password.");
			return "login";
		}
	}

}
