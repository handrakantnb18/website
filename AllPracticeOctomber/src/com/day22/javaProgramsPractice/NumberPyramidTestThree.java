package com.day22.javaProgramsPractice;

// Prints a pyramid where each row contains numbers from 1 to the row number

public class NumberPyramidTestThree {

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 8;
		printPattern(n);

	}
}
