package com.day5.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// represents a collection of key-value pairs, where 
// Keys should be unique, but values can be duplicated

public class MapInterfaceTestOne {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Amit");
		map.put(3, "Chandrakant");
		map.put(4, "Pooja");
		map.put(5, "Priyanka");
		
		System.out.println("Map elements : "+map);
		
	}
}
