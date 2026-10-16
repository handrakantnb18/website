package com.day16.javaProgramsPractice;

import java.util.ArrayList;

// ArrayList provides multiple methods to remove elements.

public class ArrayListTestEleven {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Pooja");
		list.add("Priya");
		list.add("Neha");
		list.add("Neeta");

		list.remove("Neeta");
		list.remove(5);

		System.out.println(list);

	}
}
