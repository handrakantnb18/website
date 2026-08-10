package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				10,88,79,10,25,55,25,44,66,44,25);
		
		Set<Integer> set = new HashSet<Integer>();
		
		num.stream()
		.filter(s -> !set.add(s))
		.forEach(System.out::println);
	}
}
