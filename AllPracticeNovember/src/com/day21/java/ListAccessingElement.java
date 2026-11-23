package com.day21.java;

import java.util.*;

// To access an element in the list, we can use the get() method

public class ListAccessingElement {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("1. Apple");
		al.add("2. Banana");
		al.add("3. Graphs");
		al.add("4. Stroberry");
		al.add("5. Orange");

		String first = al.get(0);
		String second = al.get(1);
		String third = al.get(2);

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(al);

	}
}
