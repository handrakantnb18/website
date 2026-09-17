package com.day17.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To check if an element is present in the list, we can use the contains() method

public class ArrayListTestSix {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add(1, "4. C++");

		boolean isPresent = list.contains("1. Java");

		System.out.println("present in the list : " + isPresent);

	}
}
