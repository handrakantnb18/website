package com.day2.java;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you find frequency of each character in a string

public class FindFrequency {

	public static void main(String[] args) {

		String inputString = "My name is chandrakant "
				+ "and i am from sangli";

		Map<Character, Long> charCountMap = 
				inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								Collectors.counting()));

		System.out.println(charCountMap);

	}
}
