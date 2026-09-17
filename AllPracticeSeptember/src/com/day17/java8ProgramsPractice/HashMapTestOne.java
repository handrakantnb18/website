package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Use the put() method to add elements to a Map

public class HashMapTestOne {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		map1.put(101, " 1. Ajit");
		map1.put(102, " 2. Rahul");
		map1.put(103, " 3. Ram");
		map1.put(104, " 4. Amit");
		map1.put(105, "5. Shivraj");
		
		map2.put(111, " 11. Pruthvi");
		map2.put(112, " 12. Vishu");
		map2.put(113, " 13. Dynana");
		map2.put(114, " 14. Viraj");
		map2.put(115, " 15. Virat");
		
		System.out.println(map1);
		
		System.out.println(map2);
		
	}
}
