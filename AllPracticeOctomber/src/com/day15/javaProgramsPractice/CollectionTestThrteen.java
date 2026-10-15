package com.day15.javaProgramsPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

//  LinkedHashSet is used to store unique elements while maintaining insertion order

public class CollectionTestThrteen {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Rahul");
		set.add("Priya");
		set.add("Rahul");
		set.add("Peter");
		set.add("Jack");
		set.add("Peter");
		set.add("Johnson");
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
