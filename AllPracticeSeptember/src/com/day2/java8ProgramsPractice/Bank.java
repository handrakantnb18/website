package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Bank {
// Find duplicate elements in a list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,2,3,4,5,6,1,5,6);
		
		Set<Integer> duplicate = 
				list.stream()
				.filter(n -> Collections.frequency(list, n) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicate);
		
		Set<Integer> seen = new HashSet<>();

		Set<Integer> duplicates = list.stream()
		        .filter(n -> !seen.add(n))
		        .collect(Collectors.toSet());
		
		System.out.println(duplicates);
		
	}
	
}
