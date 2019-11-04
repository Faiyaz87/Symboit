package com.symbiot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.symbiot.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SymbiotWebApplicationTests {

	
	@Autowired
	IUserService UserService; 
	


}
