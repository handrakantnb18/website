package com.day13.javaProgramsPractice;

import java.util.Arrays;

// Sorting the Array : to get the largest element from the array

public class LargeElementTestThree {

	public static void main(String[] args) {

		int arr[] = { 200, 15, 25, 44, 100, 92, 99 };

		Arrays.sort(arr);

		System.out.println(arr[arr.length - 1]);

	}
}
