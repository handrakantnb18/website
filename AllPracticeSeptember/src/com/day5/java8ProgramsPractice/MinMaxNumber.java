package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,55,35,15,92,37,11,66);
		
		Integer min =
		list.stream()
		.min(Collections.reverseOrder())
		.get();
		
		System.out.println(min);
		
		Integer max = 
				list.stream()
				.max(Collections.reverseOrder())
				.get();
		
		System.out.println(max);
	}
}
