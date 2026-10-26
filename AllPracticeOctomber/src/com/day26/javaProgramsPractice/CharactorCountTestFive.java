package com.day26.javaProgramsPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Q5: Count the occurrences of each character in a given String.

public class CharactorCountTestFive {

	public static void main(String[] args) {

		String input = "ilovechandraakntbhosale";

		Map<Character, Long> charCount = 
				input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								Collectors.counting()));
		
		System.out.println(charCount);

	}
}
