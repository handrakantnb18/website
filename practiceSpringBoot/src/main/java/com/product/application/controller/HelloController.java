package com.product.application.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

	
	@GetMapping(path="hello-word")
	public String helloWord() {
		return "Hello Word";
	}
	
	@GetMapping(path="hello-word")
	public String helloWord1() {
		return "Hello Word";
	}
}
