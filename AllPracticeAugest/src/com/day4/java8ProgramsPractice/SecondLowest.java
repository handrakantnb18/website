package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	// find second lowest in the list

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,98,65,45,28,
				73,29,18,55,46);
		
		Integer lowest = 
				list.stream()
				.distinct()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(lowest);
	}
}
