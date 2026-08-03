package com.day2.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	// find the Max number in the list
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				45,68,79,33,15,64,28,37,55,12);
		
		Integer max =
		list.stream()
		.max(Integer::compare)
		.get();
		
		System.out.println(max);
	}
}
