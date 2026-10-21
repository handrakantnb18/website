package com.day21.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

//  ArrayList to store String elements dynamically

public class CollectionTestTwo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");

		Collections.addAll(list, "Mango", "Grapes");
		System.out.println("After Adding: " + list);

	}
}
