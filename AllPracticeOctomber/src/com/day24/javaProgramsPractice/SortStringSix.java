package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 6. Sort a list of strings alphabetically

public class SortStringSix {

	public static void main(String[] args) {

		List<String> fruits = 
				Arrays.asList("Mango", "Apple", "Banana", "Kiwi");
		
		List<String> sortedFruits = 
				fruits.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sortedFruits);
		
	}
}
