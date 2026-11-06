package com.day5.java;

// Write a Java program to find the maximum difference between 
// two elements in an array such that the larger element appears after the smaller element

public class MaxDifference {

	public static int maxDifference(int[] arr) {
		int minElement = arr[0];
		int maxDiff = arr[1] - arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxDiff = Math.max(maxDiff, arr[i] - minElement);
			minElement = Math.min(minElement, arr[i]);
		}
		return maxDiff;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println("Maximum difference: " + 
		maxDifference(arr));

	}
}
