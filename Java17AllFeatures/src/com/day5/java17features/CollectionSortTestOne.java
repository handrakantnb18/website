package com.day5.java17features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSortTestOne {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1. Ram");
		list.add("2. Saurav");  
		list.add("3. Mukesh");  
		list.add("4. Tahir");
		list.add("5. Vijay");
				
		Collections.sort(list);
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
