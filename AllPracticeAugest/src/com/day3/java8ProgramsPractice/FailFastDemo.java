package com.day3.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// FailSafeDemo
public class FailFastDemo {

	// A Fail-Fast Iterator throws a ConcurrentModificationException 
	// if the collection is modified while iterating over it
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("Mysql");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			String str = itr.next();
			
			 if(str.equals("Spring")) {
				 list.add("Microservices");
			 }
			 
			 System.out.println(str);
		}
		
	}
}
