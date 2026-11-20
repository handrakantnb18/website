package com.day16.java;

// How do you get the sum of all elements in an integer array in Java

public class SumOffAll {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		int sum = 0;

		for (int i : array)
			sum += i;

		System.out.println(sum);

	}
}
