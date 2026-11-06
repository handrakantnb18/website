package com.day5.java;

// Write a Java program to find the missing number in an array of integers from 1 to n

public class MissingNumber {

	public static int findMissing(int[] arr, int n) {
		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;
		for (int num : arr)
			arraySum += num;
		return totalSum - arraySum;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		System.out.println("Missing number: " + findMissing(arr, 6));

	}
}
