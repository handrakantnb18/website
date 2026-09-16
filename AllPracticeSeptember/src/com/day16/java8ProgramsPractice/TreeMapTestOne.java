package com.day16.java8ProgramsPractice;

import java.util.Map;
import java.util.TreeMap;

//Storing and Iterating TreeMap Elements
// how to store key-value pairs in a TreeMap and iterate through them.

public class TreeMapTestOne {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
