package com.day20.java;

import java.util.Arrays;

// Find the second-highest number in an array

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = {99,  5, 10, 22, 25, 40, 45, 47, 30, 45, 55, 88, 20 };

		int secondHighest = Arrays
				.stream(arr)
				.distinct()
				.boxed()
				.sorted((a, b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.orElseThrow();

		System.out.println("Second Highest: " + secondHighest);

	}
}
