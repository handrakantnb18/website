package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		// Find the maximum number
		List<Integer> li = 
				Arrays.asList(10, 50, 30, 90, 40);
		
		Integer max =
				li.stream()
				.max(Integer::compare)
				.orElse(0);
		
		System.out.println(max);
		
	}
}
