package com.zeroToHero.collection;

import java.util.ArrayList;

public class IteratorArrayListLoop {

	// Iterating ArrayList using For-each loop
	// The for-each loop provides a simple and readable  
	// way to iterate through elements of an ArrayList.
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mongos");
		list.add("Apple");
		list.add("Banana");
		list.add("Graps");
		
		for(String fruit:list)
			System.out.println(fruit);
	}
}
