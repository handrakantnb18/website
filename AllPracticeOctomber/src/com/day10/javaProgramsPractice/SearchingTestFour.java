package com.day10.javaProgramsPractice;

import java.util.ArrayList;

// Creates an ArrayList to store String elements Adds elements using the add() method

public class SearchingTestFour {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");

		if (list.contains("Mango")) {
			System.out.println("Mango is present in the list");
		}

	}
}
