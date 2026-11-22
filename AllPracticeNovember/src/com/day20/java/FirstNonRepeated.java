package com.day20.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the first non-repeated character in a String

public class FirstNonRepeated {

	public static void main(String[] args) {
		
		 String str = "chandrakant bhosale";

	        Character result = str.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(
	                        Function.identity(),
	                        LinkedHashMap::new,
	                        Collectors.counting()
	                ))
	                .entrySet()
	                .stream()
	                .filter(e -> e.getValue() == 1)
	                .map(Map.Entry::getKey)
	                .findFirst()
	                .orElse(null);

	        System.out.println(result);
	}
}
