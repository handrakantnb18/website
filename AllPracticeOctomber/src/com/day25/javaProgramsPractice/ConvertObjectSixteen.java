package com.day25.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 16. How to use map to convert object into Uppercase in Java 8?

public class ConvertObjectSixteen {

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("AA", "BB", "AA", "CC");
		
		List<String> nameLst = 
				names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(nameLst);

	}
}
