package com.day24.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. Convert a list of strings to uppercase

public class StringUppercaseTwo {

	public static void main(String[] args) {

		List<String> words =
				Arrays.asList("java", "stream",
						"api", "Python", "Node", "React", "Php");

		
		List<String> upperCaseWords = 
				words.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(upperCaseWords);

	}
}
