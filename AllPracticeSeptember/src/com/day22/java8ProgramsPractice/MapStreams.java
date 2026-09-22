package com.day22.java8ProgramsPractice;

import java.util.List;

// Map() -> transfers one element into one element

public class MapStreams {

	public static void main(String[] args) {
		
		List<String> names = List.of("Chandrakant", "Pooja", "Priyanka", "Shivraj", "Kehav");
		
		List<Integer> len = names.stream()
				.map(String::length)
				.toList();
		
		System.out.println(len);
		
	}
}
