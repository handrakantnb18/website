package com.day24.java;

// Find the largest element in an array

public class LargestElement {

	public static void main(String[] args) {

		int[] arr = { 5, 55, 99, 88, 10, 25, 20, 45, 47, 30, 15 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest element: " + max);

	}
}
