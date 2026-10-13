package com.day13.javaProgramsPractice;

import java.util.Arrays;

// concise and parallelizable with other operations with the Time complexity of O(N)

public class LargeElementTestTwo {

	public static void main(String[] args) {
		
		int arr[] = {20, 10, 20, 4, 100}; 
		
		int max = Arrays.stream(arr).max().getAsInt(); 
	      
        System.out.println(max); 
        
	}
}
