package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// we are sorting the Map entries by key in ascending order.

public class MapTestFive {

	public static void main(String[] args) {

		Map<Integer, String> map = 
				new HashMap<Integer, String>();

		map.put(100, "Pravin");
		map.put(101, "Pradnya");
		map.put(102, "Seema");
		map.put(103, "Seeta");
		map.put(104, "Ram");
		map.put(105, "Priya");

		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

	}
}
