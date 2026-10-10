package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

public class InterfaceTestOne {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Orange");

		fruits.remove("Banana");

		System.out.println("After Removal: " + fruits);

	}
}
