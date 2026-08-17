package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueElement {

	public static void main(String[] args) {
		
		// Find unique elements
		List<Integer> num = 
				Arrays.asList(10, 20, 10, 30, 20, 40);
		
		List<Integer> res = 
				num.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(res);
		
	}
}
