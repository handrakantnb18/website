package com.day12.javaProgramsPractice;

// Java Program to Find Sum of Array Elements

public class SumofArrayTestOne {

	static int arr[] = { 12, 3, 4, 15 };

	static int sum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Sum of given array is " + sum());

	}
}
