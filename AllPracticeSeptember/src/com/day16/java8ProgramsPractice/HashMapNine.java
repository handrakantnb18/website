package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are creating a HashMap, adding elements, and traversing it.
// A HashMap is used to store key-value pairs

public class HashMapNine {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Orange");
		map.put(6, "Strobery");
		map.put(7, "Pinaple");
		map.put(8, "Water melan");

		System.out.println("HashMap : ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
