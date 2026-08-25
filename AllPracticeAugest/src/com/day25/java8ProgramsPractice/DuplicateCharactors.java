package com.day25.java8ProgramsPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactors {

	public static void main(String[] args) {
		
String str = "software enginner";
		
		Map<Character, Long> res =
				str.chars()
				.mapToObj(a -> (char) a)
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		res.entrySet()
		.stream()
		.filter(entry -> entry.getValue() > 1)
		.forEach(System.out::println);
		
	}
}
