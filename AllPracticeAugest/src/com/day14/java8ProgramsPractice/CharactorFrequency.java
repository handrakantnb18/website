package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the Charactor frequency in the String
public class CharactorFrequency {

	public static void main(String[] args) {
		
		String str = "my name chandraaknt bhosale";
		
		Map<String, Long> map =
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
		
		System.out.println(map);
	}
}
