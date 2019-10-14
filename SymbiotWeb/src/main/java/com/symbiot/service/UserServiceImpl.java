package com.symbiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiot.dal.UserRepository;
import com.symbiot.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserByLogin(String login) {
		return userRepository.findById(1l).get();
	}

}
