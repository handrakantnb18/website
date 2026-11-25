package com.day22.java;

import java.util.HashMap;
import java.util.Map;

// To update a value, use the put() method with the same key

public class MapChangingElements {

	public static void main(String[] args) {

		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(new Integer(1), "Pravin");
		hm1.put(new Integer(2), "Seema");
		hm1.put(new Integer(3), "Savita");
		hm1.put(new Integer(4), "Sachin");
		hm1.put(new Integer(5), "Chandrakant");
		hm1.put(new Integer(6), "Shivraj");

		System.out.println("Initial Map: " + hm1);

		hm1.put(new Integer(2), "Priyaa");

		System.out.println("Updated Map: " + hm1);

		hm1.put(new Integer(5), "Seeta");

		System.out.println("Updated Map: " + hm1);

	}
}
