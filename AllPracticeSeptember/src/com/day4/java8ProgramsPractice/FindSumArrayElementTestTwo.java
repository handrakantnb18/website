package com.day4.java8ProgramsPractice;

import java.util.Arrays;

// Java provides an inbuilt method to compute the sum using the Stream API.

public class FindSumArrayElementTestTwo {

	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
        
	}
}
