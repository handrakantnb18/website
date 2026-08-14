package com.day14.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

// find the Max number in the list
public class MinMaxNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,35,25,99,34,92,19,73,44,89);
		
		Integer max =
				list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println("Maximum Number is : "+max);
		
		Integer min =
				list.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println("Minimum Number is : "+min);
		
	}
}
