package com.day12.java8ProgramsPractice;

import java.util.ArrayList;

// how to access and modify elements in an ArrayList using the get() and set() methods.

public class IteratorTestFive {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");
		list.add("Lemon");
		list.add("Water melan");
		list.add("Pinapple");
		list.add("Mango");
		list.add("Apple");

		System.out.println("Returning element: " + list.get(1));

		list.set(1, "Dates");

		for (String fruit : list) {
			System.out.println(fruit);
		}

	}
}
