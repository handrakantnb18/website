package com.day21.java;

import java.util.ArrayList;
import java.util.List;

// Maintains insertion order, Allows duplicate elements

public class ListIntefaceOne {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("1. Java");
		li.add("2. Python");
		li.add("3. DSA");
		li.add("4. C++");
		li.add("5. React");
		li.add("6. Angular");
		li.add("7. HTML");
		li.add("8. CSS");

		System.out.println("Elements of List are:");

		for (String s : li) {
			System.out.println(s);
		}

	}
}
