package com.day13.javaProgramsPractice;

import java.util.TreeMap;

// Use the put() method to add key/value pairs:

public class MapTestFive {

	public static void main(String[] args) {

		TreeMap<String, String> capitalCities = new TreeMap<>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "New Dehli");
		capitalCities.put("Austria", "Wien");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Norway", "Oslo"); // Duplicate
		capitalCities.put("USA", "Washington DC");

		System.out.println(capitalCities);

	}
}
