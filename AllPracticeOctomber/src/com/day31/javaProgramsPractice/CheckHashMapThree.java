package com.day31.javaProgramsPractice;

import java.util.HashMap;

// Using HashMap.containsKey method

public class CheckHashMapThree {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Priya");
		map.put(2, "ajit");
		map.put(3, "Amit");
		map.put(4, "Abhijit");
		map.put(5, "Pooja");
		map.put(null, "Radha");

		int keyToBeChecked = 2;

		System.out.println("HashMap: " + map);

		boolean isKeyPresent = map.containsKey(keyToBeChecked);

		System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);

	}
}
