package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// The Map.put() method can also be used for updating values of a map

public class MapTestTwo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "David");
		map.put(101, "Robert");
		map.put(99, "Emma");

		System.out.println(map);
		map.put(102, "Noah");
		System.out.println("After updation: ");
		System.out.println(map);

	}
}
