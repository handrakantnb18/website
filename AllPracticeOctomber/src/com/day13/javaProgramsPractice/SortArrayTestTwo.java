package com.day13.javaProgramsPractice;

import java.util.ArrayList;

// Loop through the array for i = 0 to n-1. At each index i, if arr[i] is different from arr[i-1], add it to the result

public class SortArrayTestTwo {

	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		int n = arr.length;

		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		ArrayList<Integer> result = removeDuplicates(arr);

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}

	}
}
