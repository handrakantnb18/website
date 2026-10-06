package com.day5.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// The most famous way is to use a for-each loop and get the keys

public class MapInterfaceTestFive {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Raju");
		map.put(new Integer(2), "Amit");
		map.put(new Integer(3), "Rahul");
		map.put(new Integer(4), "Neha");
		map.put(new Integer(5), "Neeta");

		for (Map.Entry mapElement : map.entrySet()) {
			int key = (int) mapElement.getKey();

			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}
	}
}
