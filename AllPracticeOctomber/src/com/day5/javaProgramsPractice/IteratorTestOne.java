package com.day5.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// An Iterator object is created by calling the iterator() method on a collection object

public class IteratorTestOne {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {

			String n = it.next();
			System.out.println(n);
		}

	}
}
