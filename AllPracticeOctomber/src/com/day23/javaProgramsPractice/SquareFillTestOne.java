package com.day23.javaProgramsPractice;

// This program prints a filled square of stars (*) with n+1 rows and columns

public class SquareFillTestOne {

	public static void printPattern(int n) {
		int i, j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);
	}
}
