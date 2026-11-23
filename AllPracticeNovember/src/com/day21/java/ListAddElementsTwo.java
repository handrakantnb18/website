package com.day21.java;

import java.util.*;

// To add an element to the list, we can use the add()method

public class ListAddElementsTwo {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("1. Amit");
		al.add("2. Rahul");
		al.add("3. Amol");
		al.add("4. Ram");
		al.add("5. Priyaanka");
		al.add("6. Vijay");
		al.add(1, "1. Pooja");

		System.out.println(al);

	}
}
