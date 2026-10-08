package com.day7.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;

// Maintains a simple execution model with no parallel processing

public class Stream8TestThree {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("A", "B", "C", "D");

		names.stream()
		.forEach(System.out::println);

	}
}
