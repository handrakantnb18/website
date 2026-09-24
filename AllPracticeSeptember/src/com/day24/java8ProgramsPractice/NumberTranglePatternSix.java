package com.day24.java8ProgramsPractice;

// Zero-One Triangle Pattern
// Prints a triangle where each number alternates between 1 and 0 based on the position.

public class NumberTranglePatternSix {

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}
}
