package com.day11.java8ProgramsPractice;

import java.util.Arrays;

// Given an integer array, find the FIRST NON-REPEATING ELEMENT using Java Streams.


// Input: {4, 5, 1, 2, 1, 5, 4, 7}
// Output: 2

public class FirstNonRepeating {

	public static void main(String[] args) {
		
		int[] arr = {4,5,1,2,1,5,4,7};
		
		int result = Arrays.stream(arr)
				.filter(n -> Arrays.stream(arr)
						.filter(x -> x == n)
						.count() == 1)
				.findFirst()
				.orElse(-1);
		
		System.out.println(result);
		
	}
}
