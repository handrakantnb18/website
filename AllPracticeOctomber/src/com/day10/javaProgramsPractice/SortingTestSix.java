package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Creates an ArrayList named fruit Adds multiple fruit names to the list

public class SortingTestSix {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Orange");

		Collections.sort(fruits);

		System.out.println("After Sorting: " + fruits);

	}
}
