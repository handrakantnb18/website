package com.day16.java;

// How do you find the second largest number in an array in Java

public class SecondLargestNum {

	private static int findSecondHighest(int[] array) {
		 int highest = Integer.MIN_VALUE;
		 int secondHighest = Integer.MIN_VALUE;

		 for (int i : array) {
		  if (i > highest) {
		   secondHighest = highest;
		   highest = i;
		  } else if (i > secondHighest) {
		   secondHighest = i;
		  }

		 }
		 return secondHighest;
		}
	
	public static void main(String[] args) {
		
		
	}
}
