package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SumAllNumbers {

	public static void main(String[] args) {
		
		// Find the sum of all numbers
		List<Integer> list =
				Arrays.asList(78,98,65,22,34,71);
		
		Integer sum =
				list.stream()
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println(sum);
		
	}
}
