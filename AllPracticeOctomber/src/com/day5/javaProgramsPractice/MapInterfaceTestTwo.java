package com.day5.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

//  put() method to add elements to a Map. 
// In HashMap, insertion order isn’t preserved

public class MapInterfaceTestTwo {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Ram");
		map1.put(2, "Amit");
		map1.put(3, "Chandrakant");
		map1.put(4, "Pooja");
		map1.put(5, "Priyanka");
		
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Jeet");
		map2.put(2, "Amar");
		map2.put(3, "Seema");
		map2.put(4, "Reema");
		map2.put(5, "Neha");
		
		System.out.println(map1);
		
		System.out.println(map2);
		
	}
}
