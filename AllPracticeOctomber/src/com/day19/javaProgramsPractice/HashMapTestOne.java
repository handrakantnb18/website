package com.day19.javaProgramsPractice;

import java.util.HashMap;

// how to create a HashMap, add key-value pairs, and store null keys and values

public class HashMapTestOne {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		map.put(null, "NullKey");

		map.put(4, null);
		System.out.println("HashMap: " + map);

	}
}
