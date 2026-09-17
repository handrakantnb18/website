package com.day17.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To remove an element from the Map, we can use the remove() method.

public class HashMapTestThree {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "");
		map1.put(new Integer(101), " 1. Ajit");
		map1.put(new Integer(102), " 2. Rahul");
		map1.put(new Integer(103), " 3. Ram");
		map1.put(new Integer(104), " 4. Amit");
		map1.put(new Integer(105), "5. Shivraj");
		
		System.out.println(map1);
		
		map1.remove(new Integer(102));
		
		System.out.println(map1);
		
	}
}
