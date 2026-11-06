package com.day5.java;

// Write a Java program to find the intersection of two arrays

public class SelectionSort {

	public static void selectionSort(int[] array) {
		int n = array.length; // Get the length of the array
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i; // Assume the minimum is the first element in the unsorted part
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j; // Update the index of the minimum element
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] array = { 29, 10, 14, 37, 13 };
		selectionSort(array);
		for (int num : array) {
			System.out.print(num + " "); // Output the sorted elements
		}

	}
}
