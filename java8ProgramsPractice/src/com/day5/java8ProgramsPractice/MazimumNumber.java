package com.day5.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

public class MazimumNumber {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(
				10,22,25,35,7,8,95,55,70);
		
		
		Integer min =
				list.stream()
				.min(Integer::compare)
				.get();
				
				System.out.println("Min Number : "+min);
			
	}
	
	
}
