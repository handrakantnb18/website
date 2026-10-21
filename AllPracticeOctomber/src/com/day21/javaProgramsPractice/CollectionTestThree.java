package com.day21.javaProgramsPractice;

import java.util.ArrayList;

// deletes an element by value, while remove(0) deletes by index.

public class CollectionTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");

		list.remove("Banana");

		list.remove(0);

		System.out.println("After Removing: " + list);

	}
}
