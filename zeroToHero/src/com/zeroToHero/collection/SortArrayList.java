package com.zeroToHero.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		// sort an ArrayList using the Collections.sort() 
		// method from the java.util package.
		// how to sort elements of an ArrayList using
		// the Collections.sort() method.
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mongo");
		list.add("Graps");
		list.add("Banana");
		
		Collections.sort(list);
		
		for(String fruit : list)
			System.out.println(fruit);
		
		System.out.println("Sorting numbers...");
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);

		Collections.sort(num);
		
		for(Integer number:num)
			System.out.println(number);
		
	}
}
