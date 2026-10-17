package com.day17.javaProgramsPractice;

// how to store key-value pairs in a TreeMap and iterate through them.

import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTestSixteen {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Oliver");
		map.put(102, "Henry");
		map.put(101, "William");
		map.put(103, "Robert");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
