package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5};
		
		int[] b = new int[] {6,7,8,9,10};
		
		int[] c = IntStream.concat(Arrays.stream(a), 
				Arrays.stream(b)).sorted().toArray();
        
        System.out.println(Arrays.toString(c));
        
	}
}
