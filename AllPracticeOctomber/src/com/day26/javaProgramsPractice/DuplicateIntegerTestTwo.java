package com.day26.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// Q2: Find the duplicate elements in a given integers list

public class DuplicateIntegerTestTwo {

	public static void main(String[] args) {

		List<Integer> list = 
				Arrays.asList(10, 15, 8, 49, 25, 10, 98, 15);

		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = 
				list.stream()
				.filter(n -> !set.add(n))
				.collect(Collectors.toList());

		System.out.println(duplicates);

	}
}
