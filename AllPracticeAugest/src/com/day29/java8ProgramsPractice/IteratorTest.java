package com.day29.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		// Create an ArrayList and add some elements
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orang");
		list.add("Graps");
		
		System.out.println("Interator list : "+list);
		
		Iterator<String> it = list.iterator();
		
		//Iterate through the elements and print each one
		while (it.hasNext()) {
			String n = it.next();
			System.out.println(n);
		}
		
		
	}
}
