package com.day29.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// 4. Count Occurrences of Each Character in a String

public class CharacterFrequencyFour {

	public static void main(String[] args) {

		String str = "programming";

		Map<Character, Integer> map = 
				new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		map.forEach((key, value) -> 
		System.out.println(key + " = " + value));

	}
}
