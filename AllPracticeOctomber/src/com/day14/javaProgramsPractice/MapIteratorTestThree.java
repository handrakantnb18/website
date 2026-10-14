package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// The most common is Collections.binarySearch(), which searches in a sorted list

public class MapIteratorTestThree {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Liam");
		names.add("Jenny");
		names.add("Kasper");
		names.add("Angie");

		Collections.sort(names);
		int index = Collections.binarySearch(names, "Angie");
		System.out.println("Angie is at index: " + index);

	}
}
