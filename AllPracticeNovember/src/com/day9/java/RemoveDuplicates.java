package com.day9.java;

import java.util.LinkedHashSet;

// Write a Java program to remove duplicate characters from a string

public class RemoveDuplicates {

	public static String removeDuplicates(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char ch : str.toCharArray()) {
			set.add(ch);
		}

		StringBuilder result = new StringBuilder();

		for (char ch : set) {
			result.append(ch);
		}

		return result.toString();
	}

}
