package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 14. Multiply all elements of a list

public class MultifyAllEleFourteen {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4);

		int product = 
				numbers.stream()
				.reduce(1, (a, b) -> a * b);

		System.out.println(product);

	}
}
