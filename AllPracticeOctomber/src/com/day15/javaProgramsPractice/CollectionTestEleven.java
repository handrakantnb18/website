package com.day15.javaProgramsPractice;

import java.util.HashSet;
import java.util.Set;

// how Set stores unique elements.

public class CollectionTestEleven {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Rahul");
		set.add("Priya");
		set.add("Rahul");

		System.out.println(set);

	}
}
