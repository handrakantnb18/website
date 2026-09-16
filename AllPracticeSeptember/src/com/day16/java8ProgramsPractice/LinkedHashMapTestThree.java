package com.day16.java8ProgramsPractice;

import java.util.LinkedHashMap;

// we are fetching keys, values, and key-value pairs from LinkedHashMap.

public class LinkedHashMapTestThree {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(104, "Ram");
		map.put(105, "Chandrakant");
		map.put(106, "Pooja");

		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Key-Value pairs: " + map.entrySet());

	}
}
