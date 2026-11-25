package com.day22.java;

import java.util.HashSet;
import java.util.Set;

// To add elements to a Set in Java, use the add() method

public class SetAddingElements {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();

		s.add("B");
		s.add("B");
		s.add("C");
		s.add("A");
		s.add("D");
		s.add("E");

		System.out.println(s);

	}
}
