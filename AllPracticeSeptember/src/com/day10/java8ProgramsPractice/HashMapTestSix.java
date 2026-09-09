package com.day10.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are creating a LinkedHashMap, adding elements, and traversing it.

public class HashMapTestSix {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
