package com.day31.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,28,19,27,33,56,44,88);
		
		Integer min =
			list.stream()
			.min(Collections.reverseOrder())
			.get();
		
		System.out.println(min);
	}
}
