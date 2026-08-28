package com.day28.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapHshMapTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// Initialization of a Map : Inserting elements
		map.put(101, "Apple");
		map.put(102, "Mango");
		map.put(103, "Orenge");
		map.put(104, "Graps");
		map.put(105, "Banana");
		
		// Inserting elements — no need to use new Integer()
		map1.put(101, "Ajay");
		map1.put(102, "Mahesh");
		map1.put(103, "Oreen");
		map1.put(104, "Ganesh");
		map1.put(105, "Balu");
		
		System.out.println(map);
		System.out.println(map1);
		
		
	}
}
