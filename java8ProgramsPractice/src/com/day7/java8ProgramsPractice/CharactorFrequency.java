package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	public static void main(String[] args) {
		
		
		String name = "I am form sangli";
		
		Map<String, Long> map = 
				Arrays.stream(
						name.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map);
		
		
	}
}
