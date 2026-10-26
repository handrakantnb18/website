package com.day25.javaProgramsPractice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// 8. Given a String, find the first repeated character in it using Stream functions?

public class StringRepeatEight {

	public static void main(String[] args) {

		String input = "Java Articles are Awesome";

		Character result = 
				input.chars()
				.mapToObj(s -> Character.toLowerCase
						(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy
						(Function.identity(), 
								LinkedHashMap::new, 
								Collectors.counting()))																						
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey())
				.findFirst()
				.get();

		System.out.println(result);

		// can also try

//		Set<Character> seenCharacters = new HashSet<>();
//
//		return input.chars()
//				.mapToObj(c -> (char) c)
//				.filter(c -> !seenCharacters.add(c))
//				.findFirst()
//				.orElse(null);

	}
}
