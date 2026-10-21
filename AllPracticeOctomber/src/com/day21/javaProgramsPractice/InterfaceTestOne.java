package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Interfaces such as List, Set, and Queue extend the Collection interface

public class InterfaceTestOne {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		fruits.remove("Banana");

		System.out.println("After Removal: " + fruits);

	}
}
