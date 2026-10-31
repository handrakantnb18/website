package com.day31.javaProgramsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// How to check if a key exists in a HashMap in Java

public class CheckHashMapOne {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Ram");
		map.put(2, "Rahul");
		map.put(3, "Amit");
		map.put(4, "Abhijit");
		map.put(5, "Pooja");
		map.put(6, "Radha");

		int keyToBeChecked = 2;

		System.out.println("HashMap: " + map);

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		boolean isKeyPresent = false;

		while (iterator.hasNext()) {

			Map.Entry<Integer, String> entry = iterator.next();

			if (keyToBeChecked == entry.getKey()) {

				isKeyPresent = true;
			}
		}

		System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);

	}
}
