package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are removing elements using remove() methods.

public class HashMapTestFour {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Gaurav");

		map.remove(100);
		map.remove(102, "Rahul");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		
		}

	}
}
