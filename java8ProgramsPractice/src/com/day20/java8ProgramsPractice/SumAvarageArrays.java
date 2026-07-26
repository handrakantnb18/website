package com.day20.java8ProgramsPractice;

import java.util.Arrays;

public class SumAvarageArrays {

	public static void main(String[] args) {
		
		int[] a = new int[] 
				{45, 12, 56, 15, 24, 75, 31, 89};
        
        int sum = Arrays
        		.stream(a)
        		.sum();
         
        System.out.println("Sum of = "+sum);
         
        double average = 
        		Arrays.stream(a)
        		.average()
        		.getAsDouble();
         
        System.out.println("Average of = "+average);
	}
}
