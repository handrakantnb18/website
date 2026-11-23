package com.day21.java;

import java.util.*;

// Basic for loop with get(index), Enhanced for-each loop

public class ListIteratorElement {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("1. Apple");
		al.add("2. Banana");
		al.add("3. Graphs");
		al.add("4. Stroberry");
		al.add("5. Orange");

		al.add(1, "6. Zendu");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		for (String str : al)

			System.out.print(str + " ");

	}
}
