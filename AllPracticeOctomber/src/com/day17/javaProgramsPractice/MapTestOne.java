package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// the put() method for adding elements to the map.

public class MapTestOne {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Andrew");
		map.put(101, "Tom");
		map.put(99, "Jack");

		System.out.println(map);

	}
}
