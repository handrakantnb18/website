package com.day12.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// how to iterate through an ArrayList using the Iterator interface in Java.

public class IteratorTestThree {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Orange");
		list.add("Lemon");
		list.add("Water melan");
		list.add("Pinapple");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
