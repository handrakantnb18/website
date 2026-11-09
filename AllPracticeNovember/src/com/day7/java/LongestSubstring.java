package com.day7.java;

import java.util.HashMap;

// Write a Java program to find the longest substring without repeating characters

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		int start = 0;
		int maxLength = 0;

		for (int end = 0; end < s.length(); end++) {

			char current = s.charAt(end);

			if (map.containsKey(current)) {
				start = Math.max(start, map.get(current) + 1);
			}

			map.put(current, end);

			maxLength = Math.max(maxLength, end - start + 1);
		}

		return maxLength;
		
	}

}
