package com.day3.java;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you find the most repeated element in an array

public class RepeatedElementsArray {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList
				("Pen", "Eraser", "Note Book", "Pen", 
						"Pencil", "Pen", "Note Book", "Pencil");

		Map<String, Long> elementCountMap = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), 
						Collectors.counting()));

		Entry<String, Long> mostFrequentElement = 
				elementCountMap.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.get();

		System.out.println("Most Frequent Element : " + 
		mostFrequentElement.getKey());

		System.out.println("Count : " + 
		mostFrequentElement.getValue());

	}
}
