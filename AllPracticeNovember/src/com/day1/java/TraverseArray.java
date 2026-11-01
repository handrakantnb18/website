package com.day1.java;

// To traverse over the array from left to right and for each element

public class TraverseArray {

	static int maxSubarraySum(int[] arr) {

		int res = arr[0];

		int maxEnding = arr[0];

		for (int i = 1; i < arr.length; i++) {

			maxEnding = Math.max(maxEnding + arr[i], arr[i]);

			res = Math.max(res, maxEnding);
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, -18, 7, -1, 2, 43 };
		System.out.println(maxSubarraySum(arr));

	}
}
