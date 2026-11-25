package com.day22.java;

import java.util.HashMap;
import java.util.Map;

// Use the put() method to add elements to a Map

public class MapAddingElements {

	public static void main(String[] args) {

		Map<Integer, String> hm1 = new HashMap<>();

		Map<Integer, String> hm2 = new HashMap<>();

		hm1.put(1, "Pravin");
		hm1.put(2, "Anil");
		hm1.put(3, "Pooja");
		hm1.put(4, "Pramod");
		hm1.put(5, "Amit");
		hm1.put(6, "Priyaanka");

		hm2.put(1, "Seema");
		hm2.put(2, "Ravi");
		hm2.put(3, "Amol");
		hm2.put(4, "Ram");
		hm2.put(5, "Sonali");
		hm2.put(6, "Pranav");
		hm2.put(7, "Sanvi");

		System.out.println(hm1);

		System.out.println(hm2);

	}
}
