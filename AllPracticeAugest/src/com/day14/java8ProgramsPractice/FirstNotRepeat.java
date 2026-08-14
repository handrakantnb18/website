package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//find first not repet String in the strings
public class FirstNotRepeat {

	public static void main(String[] args) {
		
		String str = "RRama";
		
		String s = 
				Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() == 1)
				.findFirst()
				.get()
				.getKey();
		
		System.out.println(s);
		
	}
}
