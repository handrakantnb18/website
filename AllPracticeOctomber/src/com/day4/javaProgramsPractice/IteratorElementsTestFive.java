package com.day4.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// You can safely remove elements during iteration using remove()

public class IteratorElementsTestFive {

	public static void main(String[] args) {
		
		Collection<String> fruit = new ArrayList<String>(
				Arrays.asList("Apple","Banana","Mango","Orange","Anar"));
		
		Iterator<String> it = fruit.iterator();
		while (it.hasNext()) {
			String fruits = it.next();
			if(fruits.equals("Banana")) {
				it.remove();
			}
			
		}
		System.out.println("Iterator fruits : "+fruit);
		
	}
}
