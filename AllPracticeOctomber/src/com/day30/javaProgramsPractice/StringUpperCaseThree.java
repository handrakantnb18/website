package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Convert a list of strings to uppercase

public class StringUpperCaseThree {

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList(
						"ram", 
						"vijay", 
						"amit",
						"Radha",
						"datta"
						);
		List<String> upperCaseNames = 
				names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(upperCaseNames);
		
	}
}
