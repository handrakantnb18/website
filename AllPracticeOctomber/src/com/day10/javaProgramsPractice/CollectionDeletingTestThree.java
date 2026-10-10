package com.day10.javaProgramsPractice;

import java.util.ArrayList;

// remove("Banana") deletes an element by value, while remove(0) deletes by index.

public class CollectionDeletingTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");

		list.remove("Mango");

		list.remove(0);

		System.out.println("After removing : " + list);

	}
}
