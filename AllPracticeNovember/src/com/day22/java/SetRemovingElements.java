package com.day22.java;

import java.util.HashSet;
import java.util.Set;

// The values can be removed from the Set using the remove() method.

public class SetRemovingElements {

	public static void main(String[] args) {

		Set<String> h = new HashSet<String>();

		h.add("A");
		h.add("B");
		h.add("C");
		h.add("B");
		h.add("D");
		h.add("E");
		h.add("F");
		h.add("G");

		System.out.println("Initial HashSet " + h);

		h.remove("B");
		System.out.println("After removing element " + h);

	}
}
