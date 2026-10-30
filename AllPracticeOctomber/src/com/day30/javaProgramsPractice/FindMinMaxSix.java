package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// Find the maximum and minimum value in a list

public class FindMinMaxSix {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(55, 88, 97, 22, 6, 
						10, 20, 5, 45, 99);
		int max = 
				numbers.stream()
				.max(Integer::compare)
				.get();
		System.out.println(max);
		
		int min = 
				numbers.stream()
				.min(Integer::compare)
				.get();
		System.out.println(min);
		
	}
}
