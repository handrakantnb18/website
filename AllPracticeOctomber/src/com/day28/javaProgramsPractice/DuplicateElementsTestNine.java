package com.day28.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// How do you extract duplicate elements from an array

public class DuplicateElementsTestNine {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = 
				Arrays.asList(111, 222, 333, 111,
						555, 333, 777, 222);

		Set<Integer> uniqueElements = new HashSet<>();

		Set<Integer> duplicateElements = 
				listOfIntegers.stream()
				.filter(i -> !uniqueElements.add(i))
				.collect(Collectors.toSet());

		System.out.println(duplicateElements);

	}
}
