package com.day5.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// The values can be removed from the Set using the 
// remove() method.

public class SetInterfaceTestThree {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("B");
		set.add("E");
		set.add("F");

		System.out.println("Initial HashSet : " + set);

		set.remove("A");

		System.out.println("After removing elements : " + set);
	}
}
