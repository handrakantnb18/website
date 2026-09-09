package com.day9.java8ProgramsPractice;

import java.util.ArrayList;

public class ArraysListTestTwo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("1. Mango");
		list.add("2. Apple");
		list.add("3. Banana");
		list.add("4. Grapes");

		for (String fruit : list)
			System.out.println(fruit);
	}
}
