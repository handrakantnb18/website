package com.day16.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// Removing Elements from LinkedHashMap
// we are removing elements using the remove() method.

public class LinkedHashMapTestFour {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		map.put(104, "Amit");
		map.put(105, "Vijay");
		map.put(106, "Rahul");
		map.put(107, "Ram");
		
		System.out.println("Before invoking remove() method: " + map);
		map.remove(102);
		System.out.println("After invoking remove() method: " + map);

	}
}
