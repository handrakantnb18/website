package com.day14.javaProgramsPractice;

import java.util.ArrayList;
import java.util.Collections;

// Collections.max() and Collections.min() to find the largest and smallest element

public class MapIteratorTestEight {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(7);
		numbers.add(3);
		numbers.add(9);

		System.out.println("Max: " + Collections.max(numbers));
		System.out.println("Min: " + Collections.min(numbers));

	}
}
