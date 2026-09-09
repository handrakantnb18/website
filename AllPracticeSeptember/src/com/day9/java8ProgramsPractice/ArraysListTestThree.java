package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

public class ArraysListTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("1. Mango");
		list.add("2. Apple");
		list.add("3. Banana");
		list.add("4. Grapes");
		list.add("5. Orange");
		list.add("6. Khajur");

		System.out.println("Returning element: " + list.get(1));

		list.set(1, "2. Dates");

		for (String fruit : list) {
			System.out.println(fruit);
		}
	}
}
