package com.day19.java8ProgramsPractice;

// Linear Search is a simple searching algorithm that 
// checks each element of an array sequentially until 
// the required element is found or all elements have 
// been checked

public class LinearSearchTestOne {

	static int search(int a[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 3, 4, 1, 7, 5 };
		int n = a.length;

		int x = 4;

		int index = search(a, n, x);

		if (index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at index: " + index);

	}
}
