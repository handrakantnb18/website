package com.day13.java;

import java.util.Arrays;
import java.util.Collections;

// Using Collections Find and print the largest element in an array.

public class LargestElementThree {

	public static void main(String[] args) {

		Integer[] arr = { 10, 50, 20, 80, 30, 90, 40 };

		int max = Collections
				.max(Arrays.asList(arr));

		System.out.println("Largest Element: " + max);

	}
}
