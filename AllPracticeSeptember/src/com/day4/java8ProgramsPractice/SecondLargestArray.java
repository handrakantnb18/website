package com.day4.java8ProgramsPractice;

// Write a Java program to find the 𝐬𝐞𝐜𝐨𝐧𝐝 𝐥𝐚𝐫𝐠𝐞𝐬𝐭 𝐞𝐥𝐞𝐦𝐞𝐧𝐭 𝐢𝐧 𝐚𝐧 𝐚𝐫𝐫𝐚𝐲 without sorting the array.

public class SecondLargestArray {

	public static void main(String[] args) {
		
		int[] arr = {12, 35, 1, 10, 34, 1};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			}
			else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		
		System.out.println("Second Largest : "+secondLargest);
	}
}
