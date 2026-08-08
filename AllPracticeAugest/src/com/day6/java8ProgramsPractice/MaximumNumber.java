package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,12,18,19,92,34,75,37);
		
		Integer max =
				list.stream()
				.max(Integer::compare)
				.get();
				
				System.out.println(max);
			
	}
}
