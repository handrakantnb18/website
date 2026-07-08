package com.day7.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,89,65,25,45,
				90,35,75,34,88,64,37,20);
		
		Integer heighest = 
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(heighest);
		
	}
}
