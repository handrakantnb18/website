package com.day19.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are removing elements using the remove() method.

public class LinkedHashMapTestThree {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(100, "1. Amit");
		map.put(101, "2. Vijay");
		map.put(102, "3. Rahul");
		map.put(103, "4. Ram");
		map.put(104, "5. Veera");
		map.put(105, "6. Pooja");

		System.out.println("Before invoking remove() method: " + map);

		map.remove(102);
		System.out.println("After invoking remove() method: " + map);

	}
}
