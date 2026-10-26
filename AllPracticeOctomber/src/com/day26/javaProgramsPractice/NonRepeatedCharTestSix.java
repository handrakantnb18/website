package com.day26.javaProgramsPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Q6: Find the first non-repeated character in a String.

public class NonRepeatedCharTestSix {

	public static void main(String[] args) {

		String input = "ilovechandraakntbhosalefromindia";

		Optional<Character> firstNonRepeated = 
				input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								LinkedHashMap::new, 
								Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1L)
				.map(Map.Entry::getKey)
				.findFirst();

		System.out.println(firstNonRepeated);

	}
}
