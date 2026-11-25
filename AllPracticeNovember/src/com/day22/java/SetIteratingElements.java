package com.day22.java;

import java.util.HashSet;
import java.util.Set;

// There are various ways to iterate through the Set

public class SetIteratingElements {

	public static void main(String[] args) {

		Set<String> h = new HashSet<String>();

		h.add("A");
		h.add("B");
		h.add("C");
		h.add("B");
		h.add("D");
		h.add("E");
		h.add("B");
		h.add("D");
		h.add("F");

		for (String value : h)

			System.out.print(value + ", ");

		System.out.println();

	}
}
