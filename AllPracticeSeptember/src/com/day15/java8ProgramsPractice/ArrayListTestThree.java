package com.day15.java8ProgramsPractice;

import java.util.ArrayList;

// how to access and modify elements in an ArrayList using the get() and set() methods.

public class ArrayListTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println("Returning element: " + list.get(1));

		list.set(1, "Dates");

		for (String fruit : list) {
			System.out.println(fruit);
		}

	}
}
