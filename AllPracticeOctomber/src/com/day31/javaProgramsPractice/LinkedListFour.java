package com.day31.javaProgramsPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// the ArrayList to a Stream and collect elements of a stream in a LinkedList 

public class LinkedListFour {

	public static <T> List<T> convertALtoLL(List<T> aL) {

		return aL
				.stream()
				.collect(Collectors
						.toCollection(LinkedList::new));
	}

	public static void main(String[] args) {

		List<String> aL = 
				Arrays.asList("Ram", "Ajit", "Shivraj");

		System.out.println("ArrayList: " + aL);

		List<String> lL = convertALtoLL(aL);

		System.out.println("LinkedList: " + lL);

	}
}
