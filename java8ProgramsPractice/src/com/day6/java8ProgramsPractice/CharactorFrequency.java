package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	public static void main(String[] args) {
		
		String str1 = "chandrakant";
		
		Map<String, Long> map1 = Arrays.stream(
				str1.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println("First String : "+map1);
		
		String str2 = "Shivraj";
		
		Map<String, Long> map2 = Arrays.stream(
				str2.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println("Second String : "+map2);
		
		
		
		
	}
}
