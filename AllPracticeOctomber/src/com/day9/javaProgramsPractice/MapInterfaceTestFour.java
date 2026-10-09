package com.day9.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

//To remove an element from the Map, we can use the remove() method

public class MapInterfaceTestFour {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "Chandrakant");
		map1.put(new Integer(2), "Namdev");
		map1.put(new Integer(3), "Bhosale");
		map1.put(new Integer(4), "Priyanka");
		map1.put(new Integer(5), "Keshav");
		map1.put(new Integer(6), "Shivraj");
		map1.put(new Integer(7), "Ram");

		System.out.println(map1);

		map1.remove(new Integer(4));

		System.out.println(map1);

	}
}
