package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// removed using remove() methods based on key or key-value pair

public class HashMapTestTen {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(104, "Ram");
		map.put(105, "Shiraj");
		map.put(106, "Priya");
		map.put(107, "Seeta");
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
