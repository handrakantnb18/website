package com.day22.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// HashMap is used to store data as key-value pairs.
//Keys must be unique, while values can be duplicated

public class DSAHashMapTestSix {

	public static void main(String[] args) {

		Map<Object, Object> map = new HashMap<>();
		map.put(10, "hello");
		map.put(20, "chandrakaant");
		map.put("hello", " Bhosaale");
		map.put(2.0, 55);

		System.out.println(map);

	}
}
