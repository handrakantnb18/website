package com.day24.javaProgramsPractice;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

// 15. Flatten a list of lists into a single list

public class FlattenListFifteen {

	public static void main(String[] args) {

		List<List<String>> deeplyNested = 
				Arrays.asList(
						Arrays.asList("A", "B"), 
						Arrays.asList("C", "D"));

		List<String> flattened = 
				deeplyNested.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());

		System.out.println(flattened);

	}
}
