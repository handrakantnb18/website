package com.day3.java17features;

import java.util.Arrays;
import java.util.stream.IntStream;

// Write a Java program to reverse an array using Java Streams
// Input: '(1, 2, 3, 4, 5}' Output: {5, 4, 3, 2, 1}'
// At first glance, reversing an array looks like a very basic coding question.
// ❎Don't use a traditional 'for' loop 
// ❎Don't use an extra sorting method

//✅Use Java Streams

// 🔆 One possible approach is to use 'IntStream", generate the
// indexes in reverse order, and collect the elements into a new array.
// Why is this question important?

// Don't learn Java Streams just by memorizing filter); map() ; and collect). Try to solve real problems using Streams.
// That's when you actually understand where they fit.

// Time Complexity: 0(n)
// H Space Complexity: 0(n) - because a new reversed array is created.
// Would you be able to solve this using Java Streams in an interview?

public class ReverseArryStream {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] rev = IntStream.range(0, arr.length)
				.map(i -> arr[arr.length - 1 - i])
				.toArray();
		
		System.out.println(Arrays.toString(rev));
		
	}
}
