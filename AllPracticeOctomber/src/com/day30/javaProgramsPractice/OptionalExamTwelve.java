package com.day30.javaProgramsPractice;

import java.util.Optional;

// Prevents null-related bugs by forcing you to check for presence

public class OptionalExamTwelve {

	public static void main(String[] args) {

		Optional<String> name = 
				Optional.ofNullable(null);
		
		String result = 
				name.orElse("chandrakant bhosale");
		System.out.println("Name: " + result);

		name.ifPresent(n -> 
		System.out.println("Name is: " + n));

	}
}
