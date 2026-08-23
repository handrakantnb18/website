package com.day23.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,35,45,77,82,25,78,98,45,25);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(e -> !set.add(e))
		.forEach(System.out::println);
		
	}
	
}
