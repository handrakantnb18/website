package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To update a value, use the put() method with the same key. The new value replaces the old one for that key.

public class MapHashTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(new Integer(1), "Ram");
		map1.put(new Integer(2), "Shiv");
		map1.put(new Integer(3), "Datta");
		
		System.out.println("Initial Map: " + map1);

		map1.put(new Integer(2), "For");

        System.out.println("Updated Map: " + map1);
		
	}
}
