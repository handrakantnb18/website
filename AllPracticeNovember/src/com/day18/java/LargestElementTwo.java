package com.day18.java;

import java.util.Arrays;

//Using Java 8 Streams Find and print the largest element in an array.

public class LargestElementTwo {

	public static void main(String[] args) {
		
		int[] arr = { 10, 50, 20, 80, 30, 90, 40 };

		int max = Arrays
				.stream(arr)
				.max()
				.getAsInt();

		System.out.println("Largest Element: " + max);
		
		int min = Arrays
				.stream(arr)
				.min()
				.getAsInt();

		System.out.println("Largest Element: " + min);
		
	}
}
