package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// 17. Find the length of the longest string in a list

public class FindLengthStringSeventeen {

	public static void main(String[] args) {

		List<String> words = 
				Arrays.asList("HTML", "JavaScript", "CSS");

		int maxLength = 
				words.stream()
				.mapToInt(String::length)
				.max()
				.orElse(0);

		System.out.println(maxLength);

	}
}
