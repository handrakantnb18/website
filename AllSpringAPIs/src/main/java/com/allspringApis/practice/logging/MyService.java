package com.allspringApis.practice.logging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MyService {

	@GetMapping("/logging")
	public void doSomething() {
		log.info("Processing..");
		log.error("Something went wrong...");
		
	}
}
