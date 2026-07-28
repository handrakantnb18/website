package com.day21.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MinNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList
				(78,98,65,25,33,20,12,33,58);
		
		Integer min =
			list.stream()
			.min(Integer::compareTo)
			.get();
		
		System.out.println(min);
	}
}
