package com.day5.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To update a value, use the put() method with the same key

public class MapInterfaceTestThree {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Ram");
		map1.put(2, "Amit");
		map1.put(3, "Chandrakant");
		map1.put(4, "Pooja");
		map1.put(5, "Priyanka");
		
		System.out.println("Initial Map: " + map1);

        map1.put(new Integer(2), "Ajit");

        System.out.println("Updated Map: " + map1);
        
	}
}
