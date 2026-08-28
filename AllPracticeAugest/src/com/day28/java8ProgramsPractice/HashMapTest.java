package com.day28.java8ProgramsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Java program to demonstrate synchronizedMap() method
public class HashMapTest {

	public static void main(String[] args) {
		
		try {
			
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(65, "A");
			map.put(66, "B");
			map.put(67, "C");
			map.put(68, "D");
			
			System.out.println("Map is : "+map);
			
			Map<Integer, String> symap = Collections.synchronizedMap(map);
			
			System.out.println("Synchronized map is : "+symap);
			
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}
