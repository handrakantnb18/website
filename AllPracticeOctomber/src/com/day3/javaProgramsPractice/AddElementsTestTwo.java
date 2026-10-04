package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Creates an ArrayList to store String elements dynamically.
// Adds elements using add() and multiple elements at once using Collections.addAll()

public class AddElementsTestTwo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Annar");
		list.add("Mango");
		
		System.out.println("Befor adding : "+list);
		
		Collections.addAll(list, "Orange", "Graphs");
		System.out.println("After adding : "+list);
	}
}
