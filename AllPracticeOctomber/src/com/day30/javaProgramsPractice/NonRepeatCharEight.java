package com.day30.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the first non-repeated character in a String

public class NonRepeatCharEight {

	public static void main(String[] args) {

		String input = "chandraakant bhosale";

		Character firstNonRepeated = 
				input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								LinkedHashMap::new, 
								Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);

		System.out.println(firstNonRepeated);

	}
}
