package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 9. Find the sum of all digits in an integer list

public class SumAllDigitNine {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(5, 10, 15, 20);

		int sum = 
				numbers.stream()
				.reduce(0, Integer::sum);

		System.out.println(sum);

	}
}
