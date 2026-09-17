package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To update a value, use the put() method with the same key
// new value replaces the old one for that key.

public class HashMapTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "");
		map1.put(new Integer(101), " 1. Ajit");
		map1.put(new Integer(102), " 2. Rahul");
		map1.put(new Integer(103), " 3. Ram");
		map1.put(new Integer(104), " 4. Amit");
		map1.put(new Integer(105), "5. Shivraj");
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(111, " 11. Pruthvi");
		map2.put(112, " 12. Vishu");
		map2.put(113, " 13. Dynana");
		map2.put(114, " 14. Viraj");
		map2.put(115, " 15. Virat");
		
		System.out.println("Initial Map : "+map1);
		
		map2.put(new Integer(105), "Shyam");
		
		System.out.println("Updated Map : "+map2);
		
	}
}
