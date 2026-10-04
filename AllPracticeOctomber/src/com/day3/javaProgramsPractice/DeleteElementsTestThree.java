package com.day3.javaProgramsPractice;

import java.util.ArrayList;

// Creates an ArrayList to store string elements dynamically.
// remove("Orange") deletes an element by value, while remove(0) deletes by index.

public class DeleteElementsTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Graphs");
		list.add("Orange");
		list.add("Annar");
		list.add("Mango");

		System.out.println("Before delete elements : " + list);

		list.remove("Orange");

		list.remove(0);

		System.out.println("After delete elements : " + list);

	}

}
