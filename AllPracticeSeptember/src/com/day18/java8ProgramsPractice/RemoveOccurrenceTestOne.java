package com.day18.java8ProgramsPractice;

import java.util.Arrays;

// Arrays.copyOf() creates a new array containing only the valid elements.

public class RemoveOccurrenceTestOne {

	public static int[] removeElements(int[] arr, int key) {

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != key) {
				arr[index++] = arr[i];

			}
		}

		return Arrays.copyOf(arr, index);
	}

	public static void main(String[] args) {

		int[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };

		int key = 3;

		int[] result = removeElements(arr, key);

		System.out.println(Arrays.toString(result));

	}
}
