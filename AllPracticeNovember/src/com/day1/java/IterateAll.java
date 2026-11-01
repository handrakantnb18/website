package com.day1.java;

// Iterating over all subarrays - O(n^2) Time and O(1) Space

public class IterateAll {

	static int maxSubarraySum(int[] arr) {
		int res = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int currSum = 0;

			for (int j = i; j < arr.length; j++) {
				currSum = currSum + arr[j];

				res = Math.max(res, currSum);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 3, -18, 7, -10, 2, 3 };
		System.out.println(maxSubarraySum(arr));

	}
}
