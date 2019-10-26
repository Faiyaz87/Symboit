package com.symbiot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.symbiot.entity.User;
import com.symbiot.service.IUserService;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	
	@Autowired
	IUserService userService;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userService.getUserByLogin(username);
		System.out.println("user : "+user.toString());
		if (user == null) {
			throw new UsernameNotFoundException("Login not found!");
		}
		
		return new MyUserDetails(user);
	}

}
