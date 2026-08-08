package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorFrequency {

	// find the Charactor frequency in the String
	
	public static void main(String[] args) {
		
		String str1 = "my name is chandrakant bhosale and i am in pune from sangli";
		
		Map<String, Long> map =
				Arrays.stream(str1.split(" "))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map);
		
	}
}
