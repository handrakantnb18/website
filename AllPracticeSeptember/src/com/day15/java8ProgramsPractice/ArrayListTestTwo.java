package com.day15.java8ProgramsPractice;

import java.util.ArrayList;

// how to traverse an ArrayList using the for-each loop in a simple and readable way

public class ArrayListTestTwo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		for (String fruit : list)
			System.out.println(fruit);

	}
}
