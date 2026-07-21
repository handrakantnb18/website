package com.day16.java8ProgramsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHeighestNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,95,32,15,4,65,2,5,4,6,58,34,79);
	
		Integer second = 
					list.stream()
					.distinct()
					.sorted(Collections.reverseOrder())
					.skip(2)
					.findFirst()
					.get();
		
		System.out.println(second);
		
	}
}
