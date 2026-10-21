package com.day21.javaProgramsPractice;

import java.util.ArrayList;

// Collections.sort(fruits) sorts elements in ascending (natural) order.

public class CollectionTestFive {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		list.set(0, "Orange");

		System.out.println("After Updating: " + list);

	}
}
