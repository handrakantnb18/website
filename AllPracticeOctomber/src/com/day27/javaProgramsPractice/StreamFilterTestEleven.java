package com.day27.javaProgramsPractice;

import java.util.*;
import java.util.stream.Collectors;

// How to filter and collect a list of strings

public class StreamFilterTestEleven {

	public static List<String> 
	filterStrings(List<String> list, char letter) {

		return list.stream()
				.filter(s -> s.startsWith(String.valueOf(letter)))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		List<String> names = 
				Arrays.asList("java", "scala", "javascript", "ruby");

		System.out.println(filterStrings(names, 'j'));

	}
}
