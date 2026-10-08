package com.day8.javaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTestOne {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();
		m.put("Chandrakant", 1);
		m.put("Namdev", 2);
		m.put("Bhosale", 3);
		m.put("Priyanka", 4);
		m.put("Keshav", 5);
		m.put("Shivraj", 6);

		System.out.println("Map elements: " + m);

	}
}
