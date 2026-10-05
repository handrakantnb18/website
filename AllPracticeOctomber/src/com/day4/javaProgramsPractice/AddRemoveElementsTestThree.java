package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Elements can be removed using remove(E e) or removeAll(Collection c) methods

public class AddRemoveElementsTestThree {

	public static void main(String[] args) {
		
		Collection<String> fruit = new ArrayList<String>();
		fruit.add("Annar");
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Graphs");
		
		System.out.println("Initial collection : "+fruit);
		
		fruit.remove("Graphs");
		
		Collection<String> rem = new ArrayList<String>();
		rem.add("Apple");
		rem.add("Orange");
		
		fruit.removeAll(rem);
		System.out.println("After removeAll() : "+fruit);
		
		
	}
}
