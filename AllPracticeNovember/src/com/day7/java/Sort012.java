package com.day7.java;

// Write a Java program to sort an array of 0s, 1s, and 2s without using any sorting algorithm

public class Sort012 {

	public static void sort(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0 -> {
				int temp = arr[low];
				arr[low++] = arr[mid];
				arr[mid++] = temp;
			}
			case 1 -> mid++;
			case 2 -> {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high--] = temp;
			}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 0, 1, 2 };
		sort(arr);
		for (int num : arr)
			System.out.print(num + " ");

	}
}
