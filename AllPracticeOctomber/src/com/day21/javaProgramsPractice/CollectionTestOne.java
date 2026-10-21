package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Provides methods such as sort(), reverse(), shuffle(), and binarySearch()

public class CollectionTestOne {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Apple");
		al.add("Banana");
		al.add("Apple");

		Collections.sort(al);

		System.out.println(al);

	}
}
