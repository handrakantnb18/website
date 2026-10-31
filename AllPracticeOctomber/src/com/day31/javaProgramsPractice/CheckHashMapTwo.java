package com.day31.javaProgramsPractice;

import java.util.*;
import java.util.Iterator;

// If the HashMap contains null values, then this method will throw NullPointerException

public class CheckHashMapTwo {

	public static void main(String[] args) {

		try {
			HashMap<Integer, String> map = new HashMap<>();

			map.put(1, "Priya");
			map.put(2, "ajit");
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
		} catch (Exception e) {

			System.out.println(e);
		}

	}
}
