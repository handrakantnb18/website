package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// can be added using methods like put(), putIfAbsent(), and putAll().

public class HashMapEleven {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
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

		map.putIfAbsent(103, "Gaurav");

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(104, "Ravi");
		map1.putAll(map);

		for (Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
