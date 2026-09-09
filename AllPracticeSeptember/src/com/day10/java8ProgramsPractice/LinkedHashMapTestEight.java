package com.day10.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are removing elements using the remove() method.

public class LinkedHashMapTestEight {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Before invoking remove() method: " + map);
		map.remove(102);
		System.out.println("After invoking remove() method: " + map);

	}
}
