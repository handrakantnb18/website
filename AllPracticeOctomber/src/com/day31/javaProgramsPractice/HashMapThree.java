package com.day31.javaProgramsPractice;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;

// Using an iterator to iterate through a HashMap

public class HashMapThree {

	public static void main(String[] args) {

		Map<Integer, String> intType = new HashMap<Integer, String>();

		intType.put(1, "First");
		intType.put(2, "Second");
		intType.put(3, "Third");
		intType.put(4, "Fourth");

		Iterator<Entry<Integer, String>> new_Iterator = intType.entrySet().iterator();

		while (new_Iterator.hasNext()) {
			Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>) new_Iterator.next();

			System.out.println(new_Map.getKey() + " = " + new_Map.getValue());
		}

	}
}
