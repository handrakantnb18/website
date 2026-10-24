package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 16. Get the frequency of each element in a list

public class GetFrequencySixteen {

	public static void main(String[] args) {

		List<String> items = 
				Arrays.asList("apple", "apple", "banana", "apple", "orange");

		Map<String, Long> frequencyMap = items.stream()
				.collect(Collectors.groupingBy
						(Function.identity(), 
								Collectors.counting()));

		System.out.println(frequencyMap);

	}
}
