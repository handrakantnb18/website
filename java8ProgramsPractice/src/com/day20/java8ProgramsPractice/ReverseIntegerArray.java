package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,1,7,3,9,6};
		
		int[] rev = 
				IntStream.rangeClosed(
						1, arr.length)
				.map(i -> arr[arr.length - i])
				.toArray();
		
		System.out.println(Arrays.toString(rev));
		
	}
}
