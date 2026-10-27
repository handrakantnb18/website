package com.day27.javaProgramsPractice;

import java.util.Arrays;

// How to filter an array of strings by a given prefix using Java 8 Stream

public class StringPrefixFilterTestNine {

	public static void main(String[] args) {

		String[] strings = 
			{ "java", "scala", "javascript", "ruby", "spring", "angular" };
		
		String prefix = "j";
		
		String[] filtered = 
				Arrays.stream(strings)
				.filter(s -> s.startsWith(prefix))
				.toArray(String[]::new);
		
		System.out.println("Filtered strings: " + Arrays.toString(filtered));

	}
}
