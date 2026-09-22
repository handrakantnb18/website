package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// use flatMap() when your stream contains nested
// collections and you want to unpack everything into a single

public class FlatMapStreamTestThree {

	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(
				Arrays.asList("Alice", "Bob"), 
				Arrays.asList("Charlie", "David"),
				Arrays.asList("Eva")
				);

		List<String> emp =
				list.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		System.out.println(list);
		
	}
}
