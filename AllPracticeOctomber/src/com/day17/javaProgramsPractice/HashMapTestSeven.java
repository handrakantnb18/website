package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are creating a HashMap, adding elements, and traversing it.

public class HashMapTestSeven {

	public static void main(String[] args) {

		HashMap<Integer, String> map = 
				new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Orange");
		map.put(6, "Otes");
		map.put(7, "Dates");

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " 
		+ m.getValue());
		}

	}
}
