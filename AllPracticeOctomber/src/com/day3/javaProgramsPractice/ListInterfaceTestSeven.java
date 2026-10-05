package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// To check if an element is present in the list, we can use the contains() method.

public class ListInterfaceTestSeven {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. DSA");
		list.add("4. C++");
		list.add("5. React");
		list.add("6. Node");

		boolean isPresent = list.contains("1. Java");

		System.out.println("Is Java present in the list : " + isPresent);
	}
}
