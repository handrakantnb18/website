package com.day18.java8ProgramsPractice;

import java.util.Arrays;

// Java Streams provide a concise way to filter out all occurrences of the specified element.

public class RemoveOccurrenceTestTwo {

	public static void main(String[] args) {

		Integer[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;

		Integer[] result = Arrays.stream(arr).filter(element -> element != key).toArray(Integer[]::new);

		System.out.println(Arrays.toString(result));

	}
}
