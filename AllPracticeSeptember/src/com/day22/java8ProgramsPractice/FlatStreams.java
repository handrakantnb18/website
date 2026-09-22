package com.day22.java8ProgramsPractice;

import java.util.List;

// flatMap() -> transforms one element into multiple
// elements and flatterns them in to single stream

public class FlatStreams {

	public static void main(String[] args) {
		
		List<List<String>> names = List.of(
				List.of("Chandrakaant", "Rahul"),
				List.of("Amit", "Pooja"),
				List.of("Shivraj", "Priyanka"),
				List.of("Amar", "Dynana")
				);
		System.out.println(names);
		
		List<String> res =
				names.stream()
				.flatMap(List::stream)
				.toList();
		
		System.out.println(res);
		
	}
}
