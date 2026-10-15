package com.day15.javaProgramsPractice;

import java.util.HashSet;
import java.util.Iterator;

// HashSet is created to store unique elements, 
// and an Iterator is used to traverse and print each element.

public class CollectionTestTwelve {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Andrew");
		set.add("Mark");
		set.add("Peter");
		set.add("Johnson");
		set.add("Rahul");
		set.add("Priya");
		set.add("Rahul");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
