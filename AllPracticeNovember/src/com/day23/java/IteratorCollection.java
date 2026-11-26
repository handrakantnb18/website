package com.day23.java;

import java.util.ArrayList;
import java.util.Iterator;

// Traverses collection elements in the forward direction

public class IteratorCollection {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {

			String n = it.next();
			System.out.println("Elements : " + n);
		}

	}
}
