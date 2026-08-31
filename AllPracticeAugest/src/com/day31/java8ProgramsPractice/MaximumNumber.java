package com.day31.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,28,19,27,33,56,44,88);
		
		Integer max =
			list.stream()
			.max(Collections.reverseOrder())
			.get();
			
		System.out.println(max);
	}
}
