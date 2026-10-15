package com.day15.javaProgramsPractice;

import java.util.SortedSet;
import java.util.TreeSet;

// demonstrates sorted elements in ascending order.

public class CollectionTestFourteen {

	public static void main(String[] args) {

		SortedSet<String> set = new TreeSet<>();
		set.add("Peter");
		set.add("Jack");
		set.add("Peter");
		set.add("Johnson");
		set.add("Rahul");
		set.add("Priya");
		set.add("Amit");

		System.out.println(set);

	}
}
