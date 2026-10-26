package com.day26.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// 8. How do you remove duplicate elements from a list using Java 8 streams

public class RemoveDuplicateTestEight {

	public static void main(String[] args) {

		List<String> listOfStrings = 
				Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

		List<String> uniqueStrngs = 
				listOfStrings.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println(uniqueStrngs);
		
	}
}
