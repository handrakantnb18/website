package com.day30.javaProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// differences between a Stream and a Collection

public class StreamVsCollectionEleven {

	public static void main(String[] args) {

		List<Integer> numbers = 
				Arrays.asList(1, 2, 3, 4, 5);

		numbers.add(6);
		System.out.println("Collection: " + numbers);

		List<Integer> evens =
				numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Stream result: " + evens);

	}
}
