package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To remove an element from a list, we can use the remove() method

public class ArrayListTestFour {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add(1, "4. C++");

		list.add(2, "Node");

		System.out.println("Initial ArrayList " + list);

		list.remove(1);

		System.out.println("After the Index Removal " + list);

		list.remove("Node");

		System.out.println("After the Object Removal " + list);

	}
}
