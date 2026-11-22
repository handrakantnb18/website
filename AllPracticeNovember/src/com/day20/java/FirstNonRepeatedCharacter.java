package com.day20.java;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// strict interview requirement to preserve the original character order, use LinkedHashMap

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "cchandrakaant";

		Character res = 
				str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy
						(Function.identity(), 
								LinkedHashMap::new, 
								Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey())
				.findFirst()
				.orElse(null);

		System.out.println("First Non-Repeated Character: " + res);
		
	}
}
