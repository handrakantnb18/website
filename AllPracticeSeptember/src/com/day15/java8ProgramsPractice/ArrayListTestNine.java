package com.day15.java8ProgramsPractice;

import java.util.ArrayList;

// different ways to add elements to an ArrayList.

public class ArrayListTestNine {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");

		list.add(1, "Gaurav");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Sonoo");
		list2.add("Hanumat");

		list.addAll(list2);

		System.out.println(list);
	}
}
