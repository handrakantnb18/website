package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	// find second Lowest integer in the list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,66,54,25,78,22,66,45,22);
		
		Integer low =
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(low);
		
	}
}
