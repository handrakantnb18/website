package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,45,65,85,25,35,75,1,75,25,45);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(d -> !set.add(d))
		.forEach(System.out::println);
		
	}
}
