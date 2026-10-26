package com.day26.javaProgramsPractice;

import java.util.*;

// Q3: Find the second-highest number in a list of integers.

public class SecondHighTestThree {

	public static void main(String[] args) {

		List<Integer> list = 
				Arrays.asList(3, 5, 1, 9, 9, 8, 7);
		
		Optional<Integer> secondHighest = 
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();

		System.out.println(secondHighest);

	}
}
