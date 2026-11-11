package com.day8.java;

import java.util.HashMap;

// Write a Java program to count the frequency of each character in a string

public class CharacterFrequency {

	public static void countFrequency(String str) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println(map);
	}

}
