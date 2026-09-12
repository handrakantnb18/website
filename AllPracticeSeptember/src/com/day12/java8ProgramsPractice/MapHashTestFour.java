package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// There are multiple ways to iterate through the Map.
// The most famous way is to use a for-each loop and get the keys
//  The value of the key is found by using the getValue() method. 

public class MapHashTestFour {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Amit");
		map.put(new Integer(2), "Raju");
		map.put(new Integer(3), "Pooja");

		for (Map.Entry mapElement : map.entrySet()) {
			int key = (int) mapElement.getKey();

			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}
	}
}
