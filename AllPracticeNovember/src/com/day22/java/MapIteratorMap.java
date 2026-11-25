package com.day22.java;

import java.util.*;

// There are multiple ways to iterate through the Map

public class MapIteratorMap {

	public static void main(String[] args) {

		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(new Integer(1), "Pravin");
		hm1.put(new Integer(2), "Seema");
		hm1.put(new Integer(3), "Savita");
		hm1.put(new Integer(4), "Sachin");
		hm1.put(new Integer(5), "Chandrakant");
		hm1.put(new Integer(6), "Shivraj");
		hm1.put(new Integer(7), "ShivDatta");
		hm1.put(new Integer(8), "Srimant");

		for (Map.Entry mapElement : hm1.entrySet()) {
			int key = (int) mapElement.getKey();

			String value = (String) mapElement.getValue();

			System.out.println(key + " : " + value);
		}

	}
}
