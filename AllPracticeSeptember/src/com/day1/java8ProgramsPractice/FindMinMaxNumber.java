package com.day1.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinMaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,35,22,15,66,73,92,46,67,82);
		
		// find the Maximum number 
				Integer maximum =
						list.stream()
						.max(Collections.reverseOrder())
						.get();
				
				System.out.println(maximum);
				
				
	}
}
