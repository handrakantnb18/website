package com.day5.java17features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// how to sort wrapper class objects such as 
// Integer using the Collections.sort() method.
public class CollectionSortTestThree {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(Integer.valueOf(2222));
		list.add(Integer.valueOf(4444));
		
		list.add(5555);
		
		Collections.sort(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
