package com.day1.java;

import java.util.Arrays;

// Using Product Array - O(n) Time and O(1) Space

public class ProductArray {

	static int[] productExceptSelf(int[] arr) {
		int zeros = 0, idx = -1, prod = 1;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zeros++;
				idx = i;
			} else {
				prod *= arr[i];
			}
		}

		int[] res = new int[n];
		Arrays.fill(res, 0);

		if (zeros == 0) {
			for (int i = 0; i < n; i++)
				res[i] = prod / arr[i];
		}

		else if (zeros == 1)
			res[idx] = prod;

		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 3, 5, 6, 2 };
		int[] res = productExceptSelf(arr);

		for (int val : res)
			System.out.print(val + " ");

	}
}
