package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find the second largest number in a list of integers

public class FindSecondHighestNumFive {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(5, 99, 200, 13, 4, 21, 13, 27, 21, 5, 27);

		Integer secondLargest = 
				numbers.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(() -> 
				new RuntimeException
				("Not enough unique elements"));
		
		System.out.println(secondLargest);
		

	}
}
