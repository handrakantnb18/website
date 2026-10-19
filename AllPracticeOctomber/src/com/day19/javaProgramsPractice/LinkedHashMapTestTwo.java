package com.day19.javaProgramsPractice;

import java.util.LinkedHashMap;

// we are fetching keys, values, and key-value pairs from LinkedHashMap.

public class LinkedHashMapTestTwo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(100, "1. Amit");
		map.put(101, "2. Vijay");
		map.put(102, "3. Rahul");
		map.put(103, "4. Ram");
		map.put(104, "5. Veera");
		map.put(105, "6. Pooja");
		map.put(106, "7. Priya");
		map.put(107, "8. Shiv");
		map.put(108, "9. Keshav");

		System.out.println("Keys: " + map.keySet());
		
		System.out.println("Values: " + map.values());
		System.out.println("Key-Value pairs: " + map.entrySet());

	}
}
