package com.zeroToHero.collection;

import java.util.ArrayList;

public class GetSetElementsArrayList {

	public static void main(String[] args) {
		
		// Get and Set Elements in ArrayList
		// to access and modify elements in an ArrayList using the 
		// get() and set() methods.
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mongo");
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("Graps");
		
		System.out.println("Returning elements : "+list.get(1));
		
		list.add(1,"Dates");
		
		for(String fruit:list)
			System.out.println(fruit);
	}
	
}
