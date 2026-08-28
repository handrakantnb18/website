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
		
		
	}
}
