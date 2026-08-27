package com.day27.java8ProgramsPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	// Given a string, find the first non-repeated character using Java 8 Streams
	
	public static void main(String[] args) {
		
		String str = "amar";
		
		Character res = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.println("First non-repeted charactor : "+res);
		
	}
}
