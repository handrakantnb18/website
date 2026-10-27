package com.day27.javaProgramsPractice;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

// uses Collectors.toMap to create a map where each string is mapped to its length

public class StreamToMapTestTen {

	public static Map<String, Integer> mapToLength(List<String> list) {
		
		return list.stream()
				.collect(Collectors.toMap(s -> s, String::length));
	}

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("java", "scala", "javascript", "ruby");
		
		System.out.println(mapToLength(names));

	}
}
