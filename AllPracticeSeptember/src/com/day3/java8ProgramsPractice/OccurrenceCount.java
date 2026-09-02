package com.day3.java8ProgramsPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count occurrences of each character
public class OccurrenceCount {

	public static void main(String[] args) {
		
		String str = "chandraakant";

		Map<Character, Long> count = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                Function.identity(),
		                Collectors.counting()
		        ));

		System.out.println(count);
		
	}
}
