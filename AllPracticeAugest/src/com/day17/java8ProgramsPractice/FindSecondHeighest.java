package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindSecondHeighest {

	public static void main(String[] args) {
		
		// Find the second-highest number
		List<Integer> list = Arrays.asList(
				78,95,64,22,54,37,65,33,15,67);
		
		Integer high = 
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(0);
		
		System.out.println(high);
		
	}
}
