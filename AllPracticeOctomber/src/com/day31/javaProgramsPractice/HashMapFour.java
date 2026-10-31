package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Iterating through a HashMap using Lambda Expressions

public class HashMapFour {

	public static void main(String[] args) {

		Map<Character, String> charType = new HashMap<Character, String>();

		charType.put('A', "Apple");
		charType.put('B', "Basketball");
		charType.put('C', "Cat");
		charType.put('D', "Dog");

		charType.forEach((key, value) -> System.out.println(key + " = " + value));

	}
}
