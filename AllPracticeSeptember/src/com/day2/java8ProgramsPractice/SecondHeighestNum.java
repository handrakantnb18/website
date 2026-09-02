package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondHeighestNum {

	// Find the second-highest number
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				10, 20, 5, 30, 40, 40);

		Integer high = 
				num.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(null);
		
		System.out.println(high);
		
		
	}
}
