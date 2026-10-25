package com.day25.javaProgramsPractice;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// 20. How to check if list is empty in Java 8 using Optional, 
// if not null iterate through the list and print the object?

class Notes {
	private String tagName;

	public Notes(String tagName) {
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}
}

public class ArrayListCountTwenty {

	public static void main(String[] args) {

		List<Notes> noteLst = 
				Arrays.asList(new Notes("Java"), 
						null, new Notes("Streams"));

		Optional.ofNullable(noteLst)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(Objects::nonNull)
				.map(Notes::getTagName)
				.forEach(System.out::println);

	}
}
