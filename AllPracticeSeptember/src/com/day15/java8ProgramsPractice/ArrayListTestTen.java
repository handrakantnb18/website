package com.day15.java8ProgramsPractice;

import java.util.ArrayList;

// different ways to remove elements from an ArrayList.

public class ArrayListTestTen {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");

		list.remove("Vijay");
		list.remove(0);

		System.out.println(list);
	}
}
