package com.day12.java8ProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To remove an element from the Map, we can use the remove() method.

public class MapHashTestThree {

	public static void main(String[] args) {
		
		Map<Integer, String> map1  = new HashMap<Integer, String>();
		map1.put(new Integer(1), "Ram");
		map1.put(new Integer(2), "Shiv");
		map1.put(new Integer(3), "Datta");
		map1.put(new Integer(4), "Ajay");

        System.out.println(map1);

        map1.remove(new Integer(4));

        System.out.println(map1);
        
	}
}
