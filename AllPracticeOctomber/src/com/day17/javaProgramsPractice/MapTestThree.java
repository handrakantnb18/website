package com.day17.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// The Map.remove() method can be used for removing elements from a map

public class MapTestThree {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Ram");
		map.put(101, "Ajit");
		map.put(99, "Priya");

		System.out.println(map);
		map.remove(100);
		System.out.println("After removing key 100 and its mapping: ");
		System.out.println(map);

	}
}
