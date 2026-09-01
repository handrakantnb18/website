package com.product.application.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.application.entity.HelloUser;
import com.product.application.userDao.UserDaoService;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<HelloUser> retriveAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")  
	public HelloUser retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  
	
	
	
}
