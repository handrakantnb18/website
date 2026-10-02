package com.day1.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

//To update a value, use the put() method with the same key. The new value replaces the old one for that key.

public class MapHashTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Ram");
		map.put(new Integer(2), "Shiv");
		map.put(new Integer(3), "Datta");
		map.put(new Integer(4), "Pooja");
		map.put(new Integer(5), "Priya");
		map.put(new Integer(6), "Neha");
		map.put(new Integer(7), "Ajay");
		
		System.out.println("Initial map : "+map);
		
		map.put(new Integer(2), "Chandru");
		
		System.out.println("Updated map : "+map);
		
	}
}
