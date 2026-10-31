package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Iterating a HashMap through a for loop to use getValue() and getKey() functions.

public class HashMapOne {

	public static void main(String[] args) {

		Map<String, String> foodTable = new HashMap<String, String>();

		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		for (Map.Entry<String, String> set : foodTable.entrySet()) {

			System.out.println(set.getKey() + " = " + set.getValue());
		}

	}
}
