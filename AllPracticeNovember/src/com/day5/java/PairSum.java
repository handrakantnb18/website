package com.day5.java;

//  Write a Java program to find all pairs of elements in an array whose sum equals a given number

public class PairSum {

	public static void findPairs(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 5;
		findPairs(arr, target);

	}
}
