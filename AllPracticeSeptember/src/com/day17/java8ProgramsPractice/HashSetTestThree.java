package com.day17.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// After adding the elements, if we wish to access the 
// elements, we can use inbuilt methods like contains().

public class HashSetTestThree {

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

		System.out.println("Set is : " + str);

		// String s = "A"; // true

		String s = "G"; // false

		System.out.println("Contains " + s + " " + str.contains(s));

	}
}
