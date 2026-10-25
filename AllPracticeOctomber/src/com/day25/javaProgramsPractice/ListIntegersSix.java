package com.day25.javaProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 6. Given a list of integers, find the maximum value element present in it using Stream functions?

public class ListIntegersSix {

	public static void main(String[] args) {

		List<Integer> myList = 
				Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		int max = 
				myList.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println(max);

		// When numbers are given as Array

		int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		int maxdata = 
				Arrays.stream(arr)
				.boxed()
				.max(Comparator.naturalOrder())
				.get();

		System.out.println(maxdata);

	}
}
