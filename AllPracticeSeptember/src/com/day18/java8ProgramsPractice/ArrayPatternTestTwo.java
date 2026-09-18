package com.day18.java8ProgramsPractice;

import java.util.Arrays;

// Best used for concise and parallelizable with 
// other operations with the Time complexity of O(N)

public class ArrayPatternTestTwo {

	public static void main(String[] args) {
		
		int arr[] = {20, 10, 20, 4, 100};
		
        int max = Arrays.stream(arr).max().getAsInt(); 

        
        System.out.println(max);
	}
}
