package com.day28.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	// Creating a List of Strings using ArrayList
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("chandrakant");
		list.add("vijay");
		list.add("priyanka");
		list.add("Shivraj");
		
		// System.out.println(list);
		
		// Iterating through the list	
		for (String s : list) {
			System.out.println(s);
		}
		
		// Updating Elements
		list.set(3, "Dnyana");
		
		System.out.println("Updated : "+list);
		
		// Searching Elements 
		int i = list.indexOf(2);
		
		System.out.println("2 at index : "+i);
		
		int l = list.lastIndexOf(1);
		
		System.out.println("Last 2 is at index : "+l);
		
		// Removing Elements
		
		list.add(2, "pruthvi");
		
		// Adding For at 1st indexes
		System.out.println("Initial ArrayList : "+list);
		
		list.remove(1);
		
		// remove element from the above
		System.out.println("After the Index Removal : "+list);
		
		
		
	}
}
