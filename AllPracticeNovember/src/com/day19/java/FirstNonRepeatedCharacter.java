package com.day19.java;

import java.util.function.Function;
import java.util.stream.Collectors;

// Find the First Non-Repeated Character in a String

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "amit";

		Character result1 = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.findFirst()
				.orElse(null);

		System.out.println("First Non-Repeated Character: " + result1);
		
	}
}
