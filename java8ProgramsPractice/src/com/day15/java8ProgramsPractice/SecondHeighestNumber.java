package com.day15.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHeighestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,25,5,35,199,25,48,32,15);
		
		Integer second = 
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(second);
		
	}
}
