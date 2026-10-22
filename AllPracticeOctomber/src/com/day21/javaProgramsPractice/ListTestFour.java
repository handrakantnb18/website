package com.day21.javaProgramsPractice;

import java.util.*;

// To remove an element from a list, we can use the remove() method

public class ListTestFour {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("chandraaknt");
		al.add("priyanka");
		al.add("amit");
		al.add("Ram");
		
		al.add(1, "Keshav");

		System.out.println("Initial ArrayList " + al);

		al.remove(1);

		System.out.println("After the Index Removal " + al);

		al.remove("Ram");

		System.out.println("After the Object Removal " + al);

	}
}
