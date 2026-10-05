package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Removing an element from the collection

public class DeleteElementsTestOne {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Graphs");
		fruits.add("Orange");
		fruits.add("Annar");
		fruits.add("Mango");

		System.out.println("Before remove elements : "+fruits);
		
		fruits.remove("Orange");
		
		System.out.println("After remove elements : "+fruits);
		
	}
}
