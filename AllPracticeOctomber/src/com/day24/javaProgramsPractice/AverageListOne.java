package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 1. Find the average of a list of integers

public class AverageListOne {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		double average = 
				numbers.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		
		System.out.println(average);

	}
}
