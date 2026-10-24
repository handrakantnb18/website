package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 8. Concatenate a list of strings with a comma separator

public class ConcateStringEight {

	public static void main(String[] args) {

		List<String> words = 
				Arrays.asList("Red", "Green", "Blue");

		String result = 
				words.stream()
				.collect(Collectors.joining(", "));
		
		System.out.println(result);

	}
}
