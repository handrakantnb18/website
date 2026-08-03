package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	// find the Min number in the list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,96,35,24,15,13,65,29,73);
		
		Integer min =
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
	}
}
