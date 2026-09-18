package com.day18.java8ProgramsPractice;

import java.util.Arrays;

// We can sort the array to get the largest element from the array. 
// After sorting we can directly extract the last element as the
// largest element

public class ArrayPatternTestThree {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 20, 4, 100 };

		Arrays.sort(arr);

		System.out.println(arr[arr.length - 1]);

	}
}
