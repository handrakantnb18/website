package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Using a forEach to iterate through a HashMap

public class HashMapTwo {

	public static void main(String[] args) {

		Map<Character, String> charType = new HashMap<Character, String>();

		charType.put('J', "Java");
		charType.put('H', "Hibernate");
		charType.put('P', "Python");
		charType.put('A', "Angular");

		charType.forEach((key, value) -> System.out.println(key + " = " + value));

	}
}
