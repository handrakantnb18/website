package com.day12.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;

// An Iterator object is created by calling the iterator() method on a collection object

public class IteratorTestOne {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
		}
	}
}
