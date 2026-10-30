package com.day29.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 9. Remove Duplicate Elements Using Java 8 Streams

public class RemoveDuplicatesNine {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(10, 20, 30, 20, 40, 10, 50);

		List<Integer> uniqueNumbers = 
				numbers.stream().distinct()
				.collect(Collectors.toList());

		System.out.println(uniqueNumbers);

	}
}
