package com.day8.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		
		
		// Second lowest number
		List<Integer> list = Arrays.asList(78,9,87,65,35,
				12,35,48,55,78,98,56,32);
		
		Integer lowest = 
				list.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(lowest);
		
	}
}
