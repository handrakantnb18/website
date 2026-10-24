package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 13. Find the second highest number in a list

public class SecondHighTherteen {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(5, 13, 4, 21, 8, 21);

		int secondHighest = 
				numbers.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow();

		System.out.println(secondHighest);

	}
}
