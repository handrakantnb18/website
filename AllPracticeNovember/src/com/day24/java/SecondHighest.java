package com.day24.java;

// Find the second-highest number in an array

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 5, 10, 15, 20, 25, 50, 35, 40, 65, 50, 55, 30 };

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}

		System.out.println("Second Highest: " + secondHighest);

	}
}
