package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistoryApplication.class, args);
	}

}

// @EnableEurekaServer
// it tell to the IOC the application is for to register Services which are working in


