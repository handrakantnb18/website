package com.day21.javaProgramsPractice;

import java.util.*;

// To add an element to the list, we can use the add()method

public class ListTestOne {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("chandraaknt");
		al.add("priyanka");
		al.add(1, "Keshav");

		System.out.println(al);

	}

}
