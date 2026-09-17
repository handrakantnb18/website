package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// represents a collection of key-value pairs
// where Keys should be unique, but values can be duplicated.

public class HashSetTestSix {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Ajit");
		map.put(102, "Rahul");
		map.put(103, "Ram");
		map.put(104, "Amit");
		map.put(105, "Shivraj");

		System.out.println("Map Elements : " + map);

	}
}
