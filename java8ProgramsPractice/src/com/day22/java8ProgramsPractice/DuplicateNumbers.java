package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,5,2,6,5,4,9,8,22,5,44,78);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(d -> !set.add(d))
		.forEach(System.out::println);
	}
}
