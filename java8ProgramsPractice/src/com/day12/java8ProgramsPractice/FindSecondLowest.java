package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindSecondLowest {

	// Find Second Lowest Number
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,62,45,35,11,25,38,72);
		
		Integer sec = 
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(sec);
	
	}
}
