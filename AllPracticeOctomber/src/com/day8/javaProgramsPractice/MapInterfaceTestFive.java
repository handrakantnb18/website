package com.day8.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// There are multiple ways to iterate through the Map

public class MapInterfaceTestFive {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "Chandrakant");
		map1.put(new Integer(2), "Namdev");
		map1.put(new Integer(3), "Bhosale");
		map1.put(new Integer(4), "Priyanka");
		map1.put(new Integer(5), "Keshav");
		map1.put(new Integer(6), "Shivraj");
		map1.put(new Integer(7), "Ram");

		for (Map.Entry mapElement : map1.entrySet()) {
			int key = (int) mapElement.getKey();

			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}
	}
}
