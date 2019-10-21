package com.symbiot.service;

import java.util.List;

import com.symbiot.entity.User;

public interface IUserService {
	
	public List<User> getUserByLogin(String login);

}
