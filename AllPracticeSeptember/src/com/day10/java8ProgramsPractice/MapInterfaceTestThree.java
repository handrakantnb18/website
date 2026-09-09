package com.day10.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Sorting Map by Key (Ascending Order)
// we are sorting the Map entries by key in ascending order.

public class MapInterfaceTestThree {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, " Amit");
		map.put(101, " Vijay");
		map.put(102, " Rahul");
		map.put(103, " Ajit");
		map.put(104, " Amar");
		map.put(105, " Pooja");

		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

	}
}
