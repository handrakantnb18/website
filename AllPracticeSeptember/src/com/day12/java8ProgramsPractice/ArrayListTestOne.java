package com.day12.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// Iterating over List Interface in Java

public class ArrayListTestOne {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1. Sachin");
		list.add("2. Sanvi");
		list.add("3. Sayali");
		list.add("4. Sangita");
		list.add("5. Santosh");
		list.add("6. Sajjan");
		list.add("7. Satish");
		list.add("8. Sharad");

		list.add(1, "1. Shiv");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}

		System.out.println("Second :");
		
		for (String al : list)
			System.out.println(al+" ");
		
	}
}
