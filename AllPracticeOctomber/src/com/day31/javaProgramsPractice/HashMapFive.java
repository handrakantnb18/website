package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Loop through a HashMap using Stream API

public class HashMapFive {

	public static void main(String[] args) {

		Map<Integer, String> intType = new HashMap<Integer, String>();

		intType.put(1, "First");
		intType.put(2, "Second");
		intType.put(3, "Third");
		intType.put(4, "Fourth");

		intType.entrySet().stream().forEach(input -> System.out.println(input.getKey() + " : " + input.getValue()));

	}
}
