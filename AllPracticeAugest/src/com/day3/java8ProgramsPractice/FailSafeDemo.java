package com.day3.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailSafeDemo {

	// Implemented by most non-concurrent collections.
	// Better performance because it does not create a copy of the collection.
	
	public static void main(String[] args) {
		
List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("Mysql");
		
	
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
		    String value = itr.next();
		    list.add("Hibernate");   // ConcurrentModificationException
		}
	}
}
