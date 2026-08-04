package com.day3.java8ProgramsPractice;

import java.util.Optional;

public class OptionalTest {

	// The Optional class was introduced in Java 8 and 
	// is available in the java.util package.
	public static void main(String[] args) {
		
		Optional<String> name = Optional.ofNullable(null);
		
		System.out.println(name.orElse("Guest"));
		
	}
}
