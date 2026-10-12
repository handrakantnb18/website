package com.day12.javaProgramsPractice;

import java.util.Arrays;

// Using Java 8 Stream : oncise and parallelizable with other operations with the Time complexity of O(N)

public class SumofArrayTestFive {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 20, 4, 100 };

		int max = Arrays
				.stream(arr)
				.max()
				.getAsInt();

		System.out.println(max);

	}
}
