package com.day28.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapHshMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Adding key-value pairs to the map
		map.put("Ram", 101);
		map.put("Ajay", 102);
		map.put("Chandrakant", 103);
		map.put("Pooja", 104);
		map.put("Raju", 105);
		
		System.out.println(map);
		
//		for (String s : map)
//			System.out.println(s);
		
		
	}
}
