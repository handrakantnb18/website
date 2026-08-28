package com.day28.java8ProgramsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapMap {

	// Java program to demonstrate synchronizedMap() method
	public static void main(String[] args) {
		
		// Try block to check for exceptions
		try {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(65, "A");
			map.put(66, "B");
			map.put(67, "C");
			map.put(68, "D");
			
			System.out.println("Map is : "+map);
			
			// Creating a synchronized map object
			// Declaring object of type integer and string
			Map<Integer, String> synmap = 
					Collections.synchronizedMap(map);
			
			System.out.println("Sysncronized Map : "+synmap);
			
		}
		// Catch block to handle the exceptions
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}
