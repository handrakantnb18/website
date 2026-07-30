package com.day23.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEments {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,16,18,17,22,10,22,18,25,22);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(a -> !set.add(a))
		.forEach(System.out::println);
		
	}
}
