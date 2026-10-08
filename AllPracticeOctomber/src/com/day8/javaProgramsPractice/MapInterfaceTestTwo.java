package com.day8.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Use the put() method to add elements to a Map

public class MapInterfaceTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Chandrakant");
		map1.put(2, "Namdev");
		map1.put(3, "Bhosale");
		map1.put(4, "Priyanka");
		map1.put(5, "Keshav");
		map1.put(6, "Shivraj");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Amit");
		map2.put(2, "Rahul");
		map2.put(3, "Ajit");
		map2.put(4, "Pooja");
		map2.put(5, "Krushna");
		map2.put(6, "Ram");
		
		
		System.out.println(map1);
		
		System.out.println(map2);
	}
}
