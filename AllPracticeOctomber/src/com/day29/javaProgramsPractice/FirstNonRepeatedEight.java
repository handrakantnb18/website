package com.day29.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// 8. Find the First Non-Repeated Character in a String

public class FirstNonRepeatedEight {

	public static void main(String[] args) {

		String str = "swiss";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}

		System.out.println("No non-repeated character");

	}
}
