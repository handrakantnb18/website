package com.day16.javaProgramsPractice;

import java.util.ArrayList;

// dd elements using methods like add() and addAll().

public class ArrayListTestTen {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ram");
		list.add("Amit");
		list.add("Pooja");
		list.add("Priya");
		list.add("Neha");
		list.add("Neeta");

		list.add(1, "Gaurav");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Sonoo");
		list2.add("Hanumat");

		list.addAll(list2);

		System.out.println(list);

	}
}
