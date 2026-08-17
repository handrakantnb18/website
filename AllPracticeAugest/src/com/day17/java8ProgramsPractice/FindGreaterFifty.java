package com.day17.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindGreaterFifty {

	public static void main(String[] args) {
		// Find numbers greater than 50
		
		List<Integer> num = Arrays.asList(
				12,35,79,67,82,55,46,76,78);
		
		List<Integer> res = 
				num.stream()
				.filter(n -> n > 50)
				.collect(Collectors.toList());
		
		System.out.println(res);
				
	}
}
