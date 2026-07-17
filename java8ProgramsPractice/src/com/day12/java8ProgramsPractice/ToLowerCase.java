package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class ToLowerCase {

	// Convert List of Strings to Lowercase
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"VIJAY","CHANDRAKANT","PRIYANKA");
	
		str.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
	}
}
