package com.day22.java;

import java.util.HashMap;
import java.util.Map;

// To remove an element from the Map, we can use the remove() method

public class MapRemovingElements {

	public static void main(String[] args) {

		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(new Integer(1), "Pravin");
		hm1.put(new Integer(2), "Seema");
		hm1.put(new Integer(3), "Savita");
		hm1.put(new Integer(4), "Sachin");
		hm1.put(new Integer(5), "Chandrakant");
		hm1.put(new Integer(6), "Shivraj");

		System.out.println(hm1);

		hm1.remove(new Integer(4));

		System.out.println(hm1);

	}
}
