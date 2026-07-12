package com.day11.java8ProgramsPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {

	public static void main(String[] args) {
		
		
		String str = "mdjkvndiuvh";
		

		String string = 
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
			
			System.out.println(string);
		
			
	}
}
