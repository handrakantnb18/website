package com.day11.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				10,15,23,15,78,98,78,22,35,22,23);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
	
		
	}
}
