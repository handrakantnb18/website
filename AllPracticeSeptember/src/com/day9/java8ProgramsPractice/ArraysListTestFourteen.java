package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

public class ArraysListTestFourteen {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("1. Ravi");
		list1.add("2. Vijay");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("1. Ravi");

		list1.retainAll(list2);

		System.out.println(list1);
		
	}
}
