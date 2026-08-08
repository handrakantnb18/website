package com.day6.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,12,18,19,92,34,75,37);

		Integer min =
				list.stream()
				.min(Integer::compare)
				.get();
				
				System.out.println(min);
		
		
	}
}
