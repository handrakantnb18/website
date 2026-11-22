package com.day20.java;

import java.util.Arrays;
import java.util.Comparator;

// Find the Second-Highest Number from an Integer Array

public class SecondHighestNumber {

	public static void main(String[] args) {

		int[] arr = { 80, 90, 99, 55, 46, 10, 20, 30, 93, 
				77, 23, 40, 50, 50, 60 };

		Integer secondHighest = 
				Arrays.stream(arr)
				.boxed()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);

		System.out.println("Second Highest Number: " + secondHighest);

	}
}
