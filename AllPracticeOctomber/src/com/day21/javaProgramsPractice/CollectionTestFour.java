package com.day21.javaProgramsPractice;

import java.util.ArrayList;

// Adds elements using the add() method

public class CollectionTestFour {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Mango");

		
		if (list.contains("Mango")) {
			System.out.println("Mango is present in the list");
		}

	}
}
