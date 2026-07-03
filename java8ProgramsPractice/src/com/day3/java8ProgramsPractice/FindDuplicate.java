package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		
		// Find Duplicate Numbers only
		List<Integer> list = Arrays.asList(54,45,
				2,54,87,96,35,23,45,65,2,65,96);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(a -> !set.add(a))
		.forEach(System.out::println);
		
	}
}
