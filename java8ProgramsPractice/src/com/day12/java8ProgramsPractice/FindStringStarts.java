package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindStringStarts {

	// Find Strings Starting with "A"
	public static void main(String[] args) {
		
		List<String> names =
				Arrays.asList("Amit","Anil","Pravin","Ram","Ankush");
		
		names.stream()
		.filter(s -> s.startsWith("A"))
		.forEach(System.out::println);
		
	}
}
