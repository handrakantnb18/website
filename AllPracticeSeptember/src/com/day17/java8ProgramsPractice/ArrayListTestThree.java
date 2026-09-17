package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Searching in a List can be done using indexOf(), lastIndexOf() methods.

public class ArrayListTestThree {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);

		int i = list.indexOf(2);

		System.out.println("First Occurrence of 2 is at Index: " + i);

		int l = list.lastIndexOf(2);

		System.out.println("Last Occurrence of 2 is at Index: " + l);

	}
}
