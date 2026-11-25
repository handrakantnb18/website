package com.day22.java;

import java.util.HashSet;
import java.util.Set;

// if we wish to access the elements, we can use inbuilt methods like contains()

public class SetAccessingElements {

	public static void main(String[] args) {

		Set<String> h = new HashSet<String>();

		h.add("B");
		h.add("B");
		h.add("C");
		h.add("A");
		h.add("D");
		h.add("E");
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("A");

		System.out.println("Set is " + h);

		String s = "D";

		System.out.println("Contains " + s + " " + h.contains(s));

	}
}
