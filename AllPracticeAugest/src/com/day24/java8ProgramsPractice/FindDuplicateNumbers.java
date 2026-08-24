package com.day24.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				15,17,18,92,35,15,17,92,78);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(s -> !set.add(s))
		.forEach(System.out::println);
		
	}
}
