package com.day23.javaProgramsPractice;

import java.util.ArrayList;

// deletes an element by value, while remove(0) deletes by index.

public class CollectionList {

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
