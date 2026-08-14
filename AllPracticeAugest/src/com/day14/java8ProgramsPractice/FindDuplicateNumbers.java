package com.day14.java8ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,92,33,55,64,73,29,33,55,64);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(s -> !set.add(s))
		.forEach(System.out::println);
		
	}
}
