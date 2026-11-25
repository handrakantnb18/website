package com.day22.java;

import java.util.HashMap;
import java.util.Map;

// It provides efficient retrieval, insertion, and deletion operations based on keys

public class MapIteratorInterface {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();

		m.put(" Ram", 1);
		m.put("Pooja", 2);
		m.put("Smith", 3);
		m.put("Seeta", 4);
		m.put("Priyaanka", 5);
		m.put("Chandrakant", 6);

		System.out.println("Map elements: " + m);

	}
}
