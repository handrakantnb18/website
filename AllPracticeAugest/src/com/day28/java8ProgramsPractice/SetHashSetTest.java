package com.day28.java8ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

public class SetHashSetTest {

	public static void main(String[] args) {
		
		// Create a Set using HashSet
		Set<String> set = new HashSet<String>();
		set.add("Ram");
		set.add("Amit");
		set.add("Pooja");
		set.add("Ajeet");
		set.add("Ram"); // duplicate not allowed
		set.add("");
		set.add(""); // one null value allowed
		
		// The set interface provides efficient search, insertion, and deletion operations.
		System.out.println(set);
		
		// After adding the elements
		String s = "Chandrakant"; // false
		
		// String s = "Ram"; // true
		
		System.out.println("Contains "+s +" "+ set.contains(s));
		
		
	}
}
