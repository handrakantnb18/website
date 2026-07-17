package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyNum {

	// Find Frequency of Numbers
	public static void main(String[] args) {
		
		List<Integer> list =
				Arrays.asList(1,2,5,3,1,2,8,5);
		
		Map<Integer, Long> map =
				list.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map);
	}
}
