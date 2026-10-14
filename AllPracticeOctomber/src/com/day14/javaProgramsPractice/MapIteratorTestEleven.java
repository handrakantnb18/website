package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Collections.swap() swaps two elements in a list

public class MapIteratorTestEleven {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Graphs");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Otes");
		fruits.add("Orange");
		fruits.add("Mango");

		Collections.swap(fruits, 0, 2);

		System.out.println(fruits);

	}
}
