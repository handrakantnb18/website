package com.day13.javaProgramsPractice;

import java.util.HashMap;

// To add items to a HashMap, use the put() method:

public class MapTestThree {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("England", "London");
		capitalCities.put("India", "New Dehli");
		capitalCities.put("Austria", "Wien");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("Norway", "Oslo"); // Duplicate
		capitalCities.put("USA", "Washington DC");

		System.out.println(capitalCities);

	}
}
