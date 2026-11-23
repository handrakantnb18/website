package com.day21.java;

import java.util.*;

// To check if an element is present in the list, we can use the contains() method

public class ListPresentElement {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("1. Apple");
		al.add("2. Banana");
		al.add("3. Graphs");
		al.add("4. Stroberry");
		al.add("5. Orange");

		boolean isPresent = al.contains("2. Banana");

		System.out.println("Is Banana present in the list? " + isPresent);

		boolean isPresent1 = al.contains("2. Mango");

		System.out.println("Is Banana present in the list? " + isPresent1);

	}
}
