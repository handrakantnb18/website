package com.day18.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	// fins the duplicate numbers in the list
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				12,35,64,78,92,37,89,56,24,35,64,24,56);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(s -> !set.add(s))
		.forEach(System.out::println);
		
	}
}
