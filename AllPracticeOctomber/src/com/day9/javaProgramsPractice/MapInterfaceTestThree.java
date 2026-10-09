package com.day9.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

//To update a value, use the put() method with the same key

public class MapInterfaceTestThree {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(new Integer(1), "Chandrakant");
		map1.put(new Integer(2), "Namdev");
		map1.put(new Integer(3), "Bhosale");
		map1.put(new Integer(4), "Priyanka");
		map1.put(new Integer(5), "Keshav");
		map1.put(new Integer(6), "Shivraj");
		map1.put(new Integer(7), "Ram");

		System.out.println("Initial Map: " + map1);

		map1.put(new Integer(2), "Rahul");

		System.out.println("Updated Map: " + map1);

	}
}
