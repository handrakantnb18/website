package com.day31.javaProgramsPractice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

// Iterating Through a Collection

public class IterationThree {

	public static void main(String[] args) {

		Collection<String> cities = new LinkedHashSet<>();
		cities.add("New York");
		cities.add("Tokyo");
		cities.add("London");

		System.out.println("--- For-Each Loop ---");
		for (String city : cities) {
			System.out.println(city);
		}

		System.out.println("\n--- Iterator Interface ---");
		Iterator<String> iterator = cities.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\n--- Lambda forEach ---");
		cities.forEach(city -> System.out.println("City: " + city));

	}
}
