package com.day10.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collection;

// Elements can be removed using remove(E e) or removeAll(Collection c) methods. 

public class CollectionRemovingTestThree {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");

		System.out.println("Initial Collection: " + fruits);

		fruits.remove("Mango");

		System.out.println("After removing Mango : " + fruits);

		Collection<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("Banana");

		fruits.removeAll(toRemove);
		System.out.println("After removeAll(): " + fruits);

	}
}
