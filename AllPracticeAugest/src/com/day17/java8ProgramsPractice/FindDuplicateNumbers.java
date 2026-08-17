package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// Find duplicate elements
		
		List<Integer> list = 
				Arrays.asList(12,15,17,85,12,65,35,15,85);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
	}
}
