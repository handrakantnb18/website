package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		
		// Find the minimum number
		List<Integer> n =
		        Arrays.asList(10, 50, 30, 90, 40);
		
		Integer min =
			n.stream()
			.min(Integer::compare)
			.orElse(0);
			
		System.out.println(min);
	}
}
