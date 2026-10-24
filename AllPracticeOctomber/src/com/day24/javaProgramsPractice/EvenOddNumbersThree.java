package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 3. Filter even and odd numbers into two separate lists

public class EvenOddNumbersThree {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 
						12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 24, 25);

		Map<Boolean, List<Integer>> partitioned = 
				numbers.stream()
				.collect(Collectors.partitioningBy
						(n -> n % 2 == 0));

		System.out.println("Evens: " + partitioned.get(true));

		System.out.println("Odds: " + partitioned.get(false));

	}
}
