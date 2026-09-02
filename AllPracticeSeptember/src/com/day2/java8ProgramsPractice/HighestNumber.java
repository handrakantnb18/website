package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

// Find the highest number
public class HighestNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				10, 20, 5, 30, 40, 50, 88, 92);
		
		int max =
		num.stream()
		.max(Integer::compareTo)
		.orElseThrow();
		
		System.out.println(max);
		
		
	}
}
