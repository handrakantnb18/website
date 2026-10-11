package com.day11.javaProgramsPractice;

import java.util.ArrayList;

public class DeleteElementsTestThree {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Graphs");
		list.add("Orange");
		list.add("Annar");
		list.add("Mango");

		System.out.println("Before delete elements : " + list);

		list.remove("Orange");

		list.remove(0);

		System.out.println("After delete elements : " + list);

	}
}
