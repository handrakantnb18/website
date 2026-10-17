package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are adding elements using different methods like put(), putIfAbsent(), and putAll()

public class HashMapTestNine {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(104, "Ram");
		hm.put(105, "Shiraj");
		hm.put(106, "Priya");
		hm.put(107, "Seeta");
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
