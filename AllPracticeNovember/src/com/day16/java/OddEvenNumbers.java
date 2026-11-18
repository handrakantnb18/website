package com.day16.java;

//  How do you check if a list of integers contains only odd numbers in Java

import java.util.List;

public class OddEvenNumbers {

	public static boolean onlyOddNumbers(List<Integer> list) {
		 for (int i : list) {
		  if (i % 2 == 0)
		   return false;
		 }

		 return true;
		}
	
	public static void main(String[] args) {
		
		System.out.println();
	}
	
	
}
