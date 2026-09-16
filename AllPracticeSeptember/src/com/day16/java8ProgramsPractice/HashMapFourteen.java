package com.day16.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are replacing values using replace() and replaceAll() methods.

public class HashMapFourteen {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(104, "Ram");
		hm.put(105, "Chandrakant");
		hm.put(106, "Pooja");

		hm.replace(102, "Gaurav");
		hm.replaceAll((k, v) -> "Ajay");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
