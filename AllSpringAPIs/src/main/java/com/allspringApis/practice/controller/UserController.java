package com.allspringApis.practice.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.allspringApis.practice.services.UserServices;

@ControllerAdvice
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
	
	@ExceptionHandler(ConfigDataResourceNotFoundException.class)
	public ResponseEntity<String> handleNotFound(ConfigDataResourceNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAll(Exception ex){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error : " + ex.getMessage());
		
	}
	
}
