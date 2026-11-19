package com.day18.java;

//Using for Loop Find and print the largest element in an array.

public class LargestElementOne {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 20, 80, 30, 90, 40 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest Element: " + max);

	}
}
