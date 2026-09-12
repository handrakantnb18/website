package com.day12.java8ProgramsPractice;

import java.util.ArrayList;

// how to traverse an ArrayList using the for-each loop in a simple and readable way.

public class IteratorTestFour {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Lemon");
		list.add("Water melan");
		list.add("Pinapple");
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");

		for (String fruit : list)
			System.out.println(fruit);
	}
}
