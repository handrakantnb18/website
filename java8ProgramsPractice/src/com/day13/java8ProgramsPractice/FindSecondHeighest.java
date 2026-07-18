package com.day13.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHeighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,62,45,35,11,25,38,72);
		
		Integer sec = 
				list.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(sec);
	
	}
}
