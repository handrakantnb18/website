package com.day29.javaProgramsPractice;

// 3. Find the Second-Largest Element in an Integer Array

public class SecondLargestNumThree {

	public static void main(String[] args) 
	{

		int[] arr = { 10, 25, 30, 30, 15, 20 };

		int largest = Integer.MIN_VALUE;
		
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) 
		{
			System.out.println("No second-largest distinct element");
		}
		else {
			System.out.println(secondLargest);
		}

	}
}
