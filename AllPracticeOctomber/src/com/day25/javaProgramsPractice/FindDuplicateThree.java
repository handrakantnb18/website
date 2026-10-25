package com.day25.javaProgramsPractice;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

// 3. How to find duplicate elements in a given integers list in java using Stream functions?

public class FindDuplicateThree {

	public static void main(String[] args) {

		List<Integer> myList = 
				Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		
		Set<Integer> set = new HashSet();
		
		myList.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);

	}

	// Way 1 - Gives list of all distinct/unique values

	public static void getDataWithoutDuplicates() {
		
		List<Integer> myList = 
				Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		
		myList.stream()
		.distinct()
		.forEach(noDuplicateData -> 
		System.out.println(noDuplicateData));
		
	}

	// Way 2 - Gives list of all distinct/unique values

	public static void getDataWithoutDuplicates1() {
		
		List<Integer> myList = 
				Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		
		Set<Integer> set = new HashSet<>(myList);

		List<Integer> uniqueData = 
				set.stream()
				.collect(Collectors.toList());

		uniqueData.forEach(System.out::println);
	}

	// 3. When numbers are given as Array

	int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };

	List<Integer> list = 
			Arrays.stream(arr)
			.boxed().distinct()
			.collect(Collectors
					.toList());

	// }

}
