package com.day25.javaProgramsPractice;

import java.util.*;

// 4. Given the list of integers, find the first element of the list using Stream functions?

public class ListIntegerFour {

	public static void main(String[] args) {

		List<Integer> myList = 
				Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		myList.stream()
		.findFirst()
		.ifPresent(System.out::println);

		// When numbers are given as Array
		
		int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

		Arrays.stream(arr)
		.boxed().findFirst()
		.ifPresent(System.out::print);

	}
}
