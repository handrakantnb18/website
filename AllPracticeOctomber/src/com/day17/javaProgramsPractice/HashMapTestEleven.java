package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// We can replace values using replace() and replaceAll() methods

public class HashMapTestEleven {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		hm.replace(102, "Gaurav");
		hm.replaceAll((k, v) -> "Ajay");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
