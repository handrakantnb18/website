package com.day8.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(
				25,24,65,97,38,19,49,33,74,92);
		
		Integer sec = 
				li.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(sec);
	}
}
