package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// the object to be checked if it is present in the list.

public class ListTestSix {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("Ajit");
		al.add("Pooja");
		al.add("Rahul");
		al.add("Jeet");

		boolean isPresent = al.contains("Geeks");

		System.out.println("Is Geeks present in the list? " + isPresent);

	}
}
