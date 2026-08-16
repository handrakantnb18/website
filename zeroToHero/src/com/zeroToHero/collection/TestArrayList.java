package com.zeroToHero.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	// Iterating ArrayList using Iterator
	// iterate through an ArrayList using the Iterator interface in Java.
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chandrakant");
		list.add("Priyanka");
		list.add("Shivraj");
		list.add("Ram");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
