package com.day9.java;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

// Functional Programming & Streams

public class CharFrequency {

	public static String getFrequencyString(String input) {
		if (input == null || input.isBlank())
			return "";

		return input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, // Crucial:
																												// preserves
																												// insertion
																												// order
				Collectors.counting())).entrySet().stream()
				.map(entry -> entry.getKey() + String.valueOf(entry.getValue())).collect(Collectors.joining());
	}

}
