package com.symbiot.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.symbiot.entity.Device;
import com.symbiot.entity.User;
import com.symbiot.security.MyUserDetails;
import com.symbiot.service.IDevice;
import com.symbiot.service.IUserService;

@Controller
public class HomeController {
	
	@Autowired
	IUserService userService;
	
	@Autowired
	IDevice deviceService;
	
	@RequestMapping("/")
	public String index(Model model, Authentication authentication) {
		MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
		System.out.println("User has authorities: " + userDetails.getUser());
		model.addAttribute("USR_OBJ", userDetails.getUser());
		
		
		List<Device> devices = deviceService.getDeviceListForLoggedUser(userDetails.getUser());
		
		model.addAttribute("USR_DEV", devices);

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
