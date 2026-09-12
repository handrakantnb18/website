package com.day12.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// The values can be removed from the Set using the remove() method.

public class SetListTestFour {

	public static void main(String[] args) {

		Set<String> list = new HashSet<String>();
		list.add("A");
		list.add("E");
		list.add("C");
		list.add("B");
		list.add("D");
		list.add("E");

		System.out.println("Initial HashSet : "+list);
		
		list.remove("E");
		
		System.out.println("After removing element : "+list);
		
	}
}
