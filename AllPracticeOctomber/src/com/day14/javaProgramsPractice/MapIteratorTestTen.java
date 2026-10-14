package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MapIteratorTestTen {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Otes");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Graphs");
		fruits.add("Mango");

		int count = Collections.frequency(fruits, "Banana");
		System.out.println("Banana appears: " + count + " times");

	}
}
