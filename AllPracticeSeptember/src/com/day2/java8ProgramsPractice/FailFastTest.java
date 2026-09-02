package com.day2.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String fruit = itr.next();
			System.out.println(fruit);
			
	// duplicate add list name the fetch ConcurrentModificationException
			
			// if(fruit.equals("Graps")) // no error founds in this add list
			if(fruit.equals("Apple")) { // found error
				list.add("Apple");
			}
		}
	}
}
