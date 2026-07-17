package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class ConvertList {

	// Convert List of Strings to Uppercase
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"vijay","chandrakant","priyanka");
		
		str.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
	}
}
