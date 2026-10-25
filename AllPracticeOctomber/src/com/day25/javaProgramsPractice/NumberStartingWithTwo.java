package com.day25.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NumberStartingWithTwo {

	public static void main(String[] args) {

//		List<Integer> myList = 
//				Arrays.asList(10, 15, 8, 49, 25, 98, 32);
//
//		myList.stream()
//		.map(s -> s + "")
//		.filter(s -> s.startsWith("1"))
//		.forEach(System.out::println);
		

		// When numbers are given as Array and return type is list
		
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };

		List<String> list = 
				Arrays.stream(arr)
				.boxed().map(s -> s + "")
				.filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(list);

	}

	public static int[] numberStarsWithOne(int[] arr) {

		return Arrays.stream(arr)
				.filter(num -> String.valueOf(num)
						.startsWith("1"))
				.toArray();

	}
}
