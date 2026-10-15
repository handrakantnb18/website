package com.day15.javaProgramsPractice;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet is used to store unique elements in sorted order

public class CollectionTestFifteen {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("Thomas");
		set.add("Davis");
		set.add("Thomas");
		set.add("Donald");
		set.add("Peter");
		set.add("Jack");
		set.add("Peter");
		set.add("Johnson");
		set.add("Rahul");
		set.add("Priya");
		set.add("Amit");
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
