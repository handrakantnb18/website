package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,58,95,65,32,15,45,12,78,12,95,32);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(b -> !set.add(b))
		.forEach(System.out::println);
		
		
	}
}
