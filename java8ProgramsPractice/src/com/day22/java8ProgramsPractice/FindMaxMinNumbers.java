package com.day22.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMaxMinNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,98,25,35,45,
				12,35,46,97,3,55,46,23);
		
		System.out.println("********************");
		
		Integer max =
				list.stream()
				.max(Integer::compareTo)
				.get();
				
		System.out.println("Maximum number : "+max);
		System.out.println("======================");
		
		Integer min =
				list.stream()
				.min(Integer::compareTo)
				.get();
		
		System.out.println("Minimum Number : "+min);
		System.out.println("*********************");
	}
}
