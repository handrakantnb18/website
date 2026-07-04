package com.day4.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,62,14,25,72,92,33,55,64,19);
		
		Integer min =
			list.stream()
			.min(Integer::compare)
			.get();
			
		System.out.println(min);
	}
}
