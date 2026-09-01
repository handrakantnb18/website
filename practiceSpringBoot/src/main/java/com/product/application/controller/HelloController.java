package com.product.application.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

	@GetMapping(path = "hello-word")
	public String helloWord() {
		return "Hello Word";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
