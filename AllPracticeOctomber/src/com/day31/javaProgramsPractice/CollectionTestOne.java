package com.day31.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// How to Print a Collection in Java?

public class CollectionTestOne {

	public static void main(String[] args) {

		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		List<String> al = new ArrayList<String>();

		Collections.addAll(al, geeks);
		System.out.println(al);

	}
}
