package com.day3.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Provides methods such as sort(), reverse(), shuffle(), and binarySearch()

public class CollectionTestOne {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Graphs");
		list.add("Orange");
		list.add("Annar");
		list.add("Nimbu");
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
