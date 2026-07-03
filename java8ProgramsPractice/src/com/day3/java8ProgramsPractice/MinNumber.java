package com.day3.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,63,25,45,21,35,86,91);
		
		Integer min =
				list.stream()
				.min(Integer::compare)
				.get();
				
				System.out.println(min);
	}
}
