package com.day8.java;

import java.util.HashMap;

// Write a Java program to find the first non-repeating character in a string

public class FirstNonRepeatingChar {

	public static Character firstNonRepeatingChar(String str) {

		HashMap<Character, Integer> countMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}
		for (char ch : str.toCharArray()) {
			if (countMap.get(ch) == 1)
				return ch;
		}
		return null;
	}

	public static void main(String[] args) {
		String str = "swiss";
		System.out.println("First non-repeating character: " + firstNonRepeatingChar(str));
	}

}
