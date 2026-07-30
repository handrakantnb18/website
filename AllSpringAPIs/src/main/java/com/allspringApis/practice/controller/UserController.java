package com.allspringApis.practice.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.allspringApis.practice.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private final UserServices userServices;

	UserController(UserServices userServices) {
		this.userServices = userServices;
	}

	//public List<User> getUsers() {
	//	return UserServices.userServices();
	//}
	
}
