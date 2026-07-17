package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {

	// Count Occurrences of Each Character
	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		Map<String, Long> map =
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map);
		
	}
}
