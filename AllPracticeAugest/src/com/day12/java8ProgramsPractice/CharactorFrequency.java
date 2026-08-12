package com.day12.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	public static void main(String[] args) {
		
		String str = "All sessions and internships will be conducted online until Tuesday "
				+ ". Please do not come to the office, as electrical work is currently in progress.";
		
		Map<String, Long> freq = 
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(freq);
		
	}
}
