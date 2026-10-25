package com.day24.javaProgramsPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 20. Find the character with highest frequency in a String

public class CharHighFrequencyTwenty {

	public static void main(String[] args) {

		String input = "success is my life";

		Character frequentChar = 
				input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(),
								Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);

		System.out.println(frequentChar);

	}
}
