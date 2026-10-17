package com.day17.javaProgramsPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// we are sorting the Map entries by key in descending order

public class MapTestSix {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(106, "Pravin");
		map.put(107, "Pradnya");
		map.put(108, "Seema");
		map.put(103, "Seeta");
		map.put(104, "Ram");
		map.put(105, "Priya");

		map.put(100, "Garcia");
		map.put(101, "Williams");
		map.put(102, "Liam");

		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey
				(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}
}
