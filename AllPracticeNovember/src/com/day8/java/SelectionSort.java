package com.day8.java;

// Write a Java program to find the intersection of two arrays

public class SelectionSort {

	public static void selectionSort(int[] array) {
		
		int n = array.length; 
		for (int i = 0; i < n - 1; i++) {
			
			int minIndex = i;  
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j; 
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
			System.out.print(num + " ");
		}
	}

}
