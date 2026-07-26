package com.day20.java8ProgramsPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChar {

	public static void main(String[] args) {
		
		String str = "my name is chandrakant bhosale.";
		
		Map<Character, Long> ch = 
				str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(), 
						Collectors.counting()));
		
		System.out.println(ch);
		
	}
}
