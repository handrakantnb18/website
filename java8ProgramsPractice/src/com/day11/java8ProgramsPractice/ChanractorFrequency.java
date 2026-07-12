package com.day11.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChanractorFrequency {

	public static void main(String[] args) {
		
String s = "priyanka bhosale priyanka ";
		

		Map<String, Long> map =
				Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()));
						
				System.out.println(map);
	
	}
}
