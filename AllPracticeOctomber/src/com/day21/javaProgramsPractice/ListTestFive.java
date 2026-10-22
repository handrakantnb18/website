package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.List;

// This method returns the element at the specified index in the list.

public class ListTestFive {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("chandraaknt");
		al.add("priyanka");
		al.add("amit");
		al.add("Ram");

		String first = al.get(0);
		String second = al.get(1);
		String third = al.get(2);
		String four = al.get(3);

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(four);

		System.out.println(al);

	}
}
