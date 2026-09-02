package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find numbers starting with 1
public class StartingNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 100, 45);

		List<Integer> result = numbers.stream()
		        .map(String::valueOf)
		        .filter(s -> s.startsWith("1"))
		        .map(Integer::valueOf)
		        .collect(Collectors.toList());

		System.out.println(result);
		
		
	}
}
