package com.day16.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	// demonstrates how to use the Collection interface to 
	// store and display elements.
	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Pooja");
		list.add("Shivraj");
		
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
