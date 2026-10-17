package com.day17.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// the Java LinkedHashMap class to understand its usage.

public class LinkedHashMapTestTewlve {

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
