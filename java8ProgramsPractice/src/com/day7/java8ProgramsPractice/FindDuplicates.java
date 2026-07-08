package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				4,5,6,7,8,9,4,2,3,5,7);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(d -> !set.add(d))
		.forEach(System.out::println);
		
	}
}
