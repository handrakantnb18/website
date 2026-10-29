package com.day28.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// Print duplicate characters in a string

public class DuplicateCharTestTen {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day"
				.replaceAll("\\s+", "")
				.toLowerCase();

		Set<String> uniqueChars = new HashSet<>();

		Set<String> duplicateChars = 
				Arrays.stream(inputString.split(""))
				.filter(ch -> !uniqueChars.add(ch))
				.collect(Collectors.toSet());
		
		System.out.println(duplicateChars);

	}
}
