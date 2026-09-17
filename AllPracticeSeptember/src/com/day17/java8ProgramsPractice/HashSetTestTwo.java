package com.day17.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// Set interface provides commonly used operations
// to manage unique elements in a collection
public class HashSetTestTwo {

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

		System.out.println(str);

	}
}
