package com.day9.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindGreater50 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,35,29,27,11,15,16,55,80,79);
		
		list.stream()
		.filter(n -> n > 50)
		.forEach(System.out::println);
	}
}
