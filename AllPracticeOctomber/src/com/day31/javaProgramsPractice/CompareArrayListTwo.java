package com.day31.javaProgramsPractice;

import java.util.ArrayList;

// how to compare two ArrayList objects in Java using the equals() method.

public class CompareArrayListTwo {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		ArrayList<String> list2 = new ArrayList<>();

		list1.add("item 1");
		list1.add("item 2");
		list1.add("item 3");
		list1.add("item 4");

		list2.add("item 1");
		list2.add("item 2");
		list2.add("item 3");
		list2.add("item 4");

		System.out.println("ArrayList1 = " + list1);
		System.out.println("ArrayList2 = " + list2);

		if (list1.equals(list2)) {

			System.out.println("Array Lists are equal");
		} else {

			System.out.println("Array Lists are not equal");
		}

		System.out.println("Adding one more element to ArrayList1");
		list1.add("item 5");

		System.out.println("ArrayList1 = " + list1);
		System.out.println("ArrayList2 = " + list2);

		if (list1.equals(list2)) {

			System.out.println("Array Lists are equal");
		} else {

			System.out.println("Array Lists are not equal");
		}

	}
}
