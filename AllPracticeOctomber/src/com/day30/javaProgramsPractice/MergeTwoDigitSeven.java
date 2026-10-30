package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

// Merge two unsorted arrays into a single, sorted array without duplicates

public class MergeTwoDigitSeven {

	public static void main(String[] args) {

		int[] arrayA = new int[] { 12, 32, 43, 8 };
		int[] arrayB = new int[] { 43, 8, 5, 21 };

		int[] mergedSortedArray = 
				IntStream.concat(Arrays.stream(arrayA),
						Arrays.stream(arrayB))
				.distinct()
				.sorted()
				.toArray();

		System.out.println(mergedSortedArray);
		
	}
}
