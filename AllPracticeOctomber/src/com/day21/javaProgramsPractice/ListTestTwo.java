package com.day21.javaProgramsPractice;

import java.util.*;

// To update an element in a list, use the set() method with the target index and the new value

public class ListTestTwo {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("chandraaknt");
		al.add("priyanka");
		al.add("amit");
		al.add("Ram");
		al.add(1, "Keshav");

		System.out.println("Initial ArrayList " + al);

		al.set(1, "sachin");

		System.out.println("Updated ArrayList " + al);

	}
}
