package com.day25.javaProgramsPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// 22. Write a program to print the count of each character in a String?

public class ArrayListCountTwentyTwo {

	public static void findCountOfChars(String s) {
		
		Map<String, Long> map = 
				Arrays.stream(s.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy
						(str -> str, LinkedHashMap::new,
								Collectors.counting()));
	}

}
