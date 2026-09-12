package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// Use the put() method to add elements to a Map. In HashMap, insertion order isn’t preserved

public class MapHashTestOne {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Ram");
        map1.put(2, "Rahul");
        map1.put(3, "Rani");
        map1.put(4, "Ragini");
        map1.put(5, "Ravi");
        
		Map<Integer, String> map2 = new HashMap<Integer, String>();
        
        map2.put(6, "Raju");
        map2.put(7, "Rajat");
        map2.put(8, "Ramesh");
        map2.put(9, "Ranjeet");
        
        System.out.println(map1);
        
        System.out.println(map2);
        
	}
}
