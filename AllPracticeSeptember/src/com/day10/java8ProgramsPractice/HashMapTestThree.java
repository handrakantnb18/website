package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are adding elements using different methods like put(), putIfAbsent(), and putAll().

public class HashMapTestThree {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		hm.putIfAbsent(103, "Gaurav");

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Ravi");
		map.putAll(hm);

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		
		}

	}
}
