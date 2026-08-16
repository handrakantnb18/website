package com.zeroToHero.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorSortArrayList {

	public static void main(String[] args) {
		// Iterating Collection through Other Ways
		// traverse an ArrayList using multiple methods like 
		// ListIterator, for loop, forEach(), and forEachRemaining().
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Rahul");
		list.add("Amit");
		list.add("Amir");
		
		System.out.println("List Iterator Reverse :");
		
		ListIterator<String> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("For Loop : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("ForEach() : ");
		
		list.forEach(a -> System.out.println(a));
		
		System.out.println("forEachRemainig(): ");
		Iterator<String> itr1 = list.iterator();
		itr1.forEachRemaining(a -> System.out.println(a));
		
	}
}
