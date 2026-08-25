package com.day25.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

//find min number in the list
public class MinNumbers {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				78,99,15,25,45,85,88,35,66,12,92);
		
		Integer min =
				num.stream()
				.min(Integer::compare)
				.get();
		
		System.out.println(min);
	}
}
