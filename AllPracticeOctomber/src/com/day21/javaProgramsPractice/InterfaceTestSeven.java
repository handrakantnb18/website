package com.day21.javaProgramsPractice;

import java.util.*;

// Maintains insertion order, Allows duplicate elements

public class InterfaceTestSeven {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("Java");
		li.add("Python");
		li.add("DSA");
		li.add("C++");

		System.out.println("Elements of List are:");

		for (String s : li) {
			System.out.println(s);
		}

	}
}
