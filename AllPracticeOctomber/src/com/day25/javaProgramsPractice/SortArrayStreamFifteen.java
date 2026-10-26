package com.day25.javaProgramsPractice;

import java.util.Arrays;

// 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?

public class SortArrayStreamFifteen {

	public static void main(String[] args) {

		int arr[] = { 99, 55, 203, 99, 4, 91 };

		Arrays.parallelSort(arr);

		Arrays.stream(arr)
		.forEach(n -> System.out.print(n + " "));

	}
}
