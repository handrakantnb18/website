package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Iterating over List Interface in Java
// Basic for loop with get(index) Enhanced for-each loop

public class ArrayListTestEight {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add(1, "4. C++");
		list.add("Node");
		list.add("MySQL");

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		for (String str : list)

			System.out.print(str + " ");

	}
}
