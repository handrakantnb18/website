package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are adding a duplicate key, which replaces the previous value.

public class HashMapTestTwo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Grapes");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
