package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Provides methods such as sort(), reverse(), shuffle(), and binarySearch()

public class CollectionTestOne {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Graps");
		list.add("Orange");
		list.add("Mango");

		Collections.sort(list);

		System.out.println(list);

	}
}
