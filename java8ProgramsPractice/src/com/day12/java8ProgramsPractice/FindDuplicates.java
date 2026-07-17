package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	// Find Duplicate Elements
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				1,5,3,5,7,8,9,6,4,9,8);
		
		Set<Integer> set = new HashSet<Integer>();
		
		num.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
	}
}
