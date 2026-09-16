package com.day16.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

// we are creating a LinkedHashMap, adding elements, and traversing it.

public class LinkedHashMapTestOne {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(104, "Ram");
		hm.put(105, "Chandrakant");
		hm.put(106, "Pooja");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
