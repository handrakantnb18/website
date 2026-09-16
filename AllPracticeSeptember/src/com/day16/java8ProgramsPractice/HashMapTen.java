package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// HashMap does not allow duplicate keys. If a duplicate key is added, 
// the old value is replaced with the new value.

public class HashMapTen {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(4, "Grapes");
		map.put(5, "Orange");
		map.put(6, "Strobery");
		map.put(7, "Pinaple");
		map.put(8, "Water melan");
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(2, "Apple");
		map.put(3, "Banana");
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
