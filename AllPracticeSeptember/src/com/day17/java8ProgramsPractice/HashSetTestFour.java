package com.day17.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// The values can be removed from the Set using the remove() method.

public class HashSetTestFour {

	public static void main(String[] args) {

		Set<String> str = new HashSet<String>();
		str.add("B");
		str.add("B");
		str.add("C");
		str.add("A");
		str.add("D");
		str.add("E");
		str.add("F");
		str.add("A");

		System.out.println("Initial HashSet : " + str);

		str.remove("C");

		System.out.println("After removing element : " + str);

	}
}
