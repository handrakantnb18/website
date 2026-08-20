package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,32,18,19,22,54,67,92);
		
		// find the Max number in the list
		Integer max =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println("Maximum Number : "+max);
		
		// find the Min number in the list
		Integer min = 
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println("Minimum Number : "+min);
		
	}
}
