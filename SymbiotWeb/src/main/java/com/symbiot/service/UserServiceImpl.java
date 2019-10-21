package com.symbiot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiot.dal.UserRepository;
import com.symbiot.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getUserByLogin(String Login) {
		return userRepository.findByLogin(Login);
	}

}
