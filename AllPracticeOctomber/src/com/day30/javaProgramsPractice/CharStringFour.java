package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count occurrences of each character in a String

public class CharStringFour {

	public static void main(String[] args) {

		String input = "chandraakant bhosale";
		
		Map<String, Long> charCount = 
				Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy
						(Function.identity(), 
								Collectors.counting()));
		
		System.out.println(charCount);
		
	}
}
