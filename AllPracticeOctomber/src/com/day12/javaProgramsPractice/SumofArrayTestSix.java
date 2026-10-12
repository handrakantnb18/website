package com.day12.javaProgramsPractice;

import java.util.Arrays;

// Sorting the Array : sort the array to get the largest element from the array

public class SumofArrayTestSix {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 20, 4, 100 };

		Arrays.sort(arr);

		System.out.println(arr[arr.length - 1]);

	}
}
