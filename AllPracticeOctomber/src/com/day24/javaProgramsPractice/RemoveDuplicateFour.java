package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 4. Remove duplicate elements from a list

public class RemoveDuplicateFour {

	public static void main(String[] args) {

		
		List<Integer> numbers = 
				Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 8);
		
		List<Integer> uniqueNumbers = 
				numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(uniqueNumbers);

	}
}
