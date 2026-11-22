package com.day20.java;

import java.util.*;
import java.util.stream.Collectors;

// Find duplicate elements in a List

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 15, 5, 88, 99, 10, 20, 30, 20, 40, 10, 50);

		Set<Integer> duplicates = 
				list.stream()
				.filter(n -> Collections
						.frequency(list, n) > 1)
				.collect(Collectors.toSet());

		System.out.println(duplicates);

	}
}
