package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,96,54,78,2,5,4,1,2,5,35,88);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(a -> !set.add(a))
		.forEach(System.out::println);
		
	}
}
