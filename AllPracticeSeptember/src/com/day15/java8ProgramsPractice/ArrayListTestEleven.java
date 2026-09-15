package com.day15.java8ProgramsPractice;

import java.util.ArrayList;

// how to retain common elements in an ArrayList.

public class ArrayListTestEleven {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ravi");
		list1.add("Vijay");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ravi");

		list1.retainAll(list2);

		System.out.println(list1);

	}
}
