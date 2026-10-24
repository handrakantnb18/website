package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 12. Group a list of strings by their length

public class ListStringTewelve {

	public static void main(String[] args) {

		List<String> words = 
				Arrays.asList("cat", "elephant", "dog", "tiger");
		Map<Integer, List<String>> groupedByLength = 
				words.stream()
				.collect(Collectors.groupingBy
						(String::length));

		System.out.println(groupedByLength);

	}
}
