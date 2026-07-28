package com.day21.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,35,22,14,78,65,98,14);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(d -> !set.add(d))
		.forEach(System.out::println);
		
	}
}
