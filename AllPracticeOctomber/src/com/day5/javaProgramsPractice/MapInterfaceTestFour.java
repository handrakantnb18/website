package com.day5.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

// To remove an element from the Map, we can use the remove() method. 

public class MapInterfaceTestFour {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "Ram");
		map.put(new Integer(2), "Amit");
		map.put(new Integer(3), "Chandrakant");
		map.put(new Integer(4), "Pooja");
		map.put(new Integer(5), "Priyanka");
		
		System.out.println(map);

        map.remove(new Integer(4));

        System.out.println(map);
	}
}
