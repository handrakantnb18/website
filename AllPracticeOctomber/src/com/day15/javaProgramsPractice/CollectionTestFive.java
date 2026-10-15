package com.day15.javaProgramsPractice;

import java.util.Iterator;
import java.util.Vector;

// Vector is created and traversed using an Iterator to print each element in the collection

public class CollectionTestFive {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("Apple");
		v.add("Banana");
		v.add("Orange");
		v.add("Plum");
		v.add("Apple");
		v.add("Banana");
		v.add("Orange");
		v.add("Plum");
		
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
