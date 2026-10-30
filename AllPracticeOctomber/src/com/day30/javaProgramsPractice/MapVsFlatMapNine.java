package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// difference between map and flatMap in Streams

public class MapVsFlatMapNine {

	public static void main(String[] args) {

		List<List<String>> nestedList = 
				Arrays.asList(Arrays.asList("A1", "A2"),
						Arrays.asList("B1", "B2"));

		List<List<String>> mapped = 
				nestedList.stream()
				.map(list -> list)
				.collect(Collectors.toList());
		System.out.println(mapped);

		List<String> flattened = 
				nestedList.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		
		System.out.println(flattened);

	}
}
