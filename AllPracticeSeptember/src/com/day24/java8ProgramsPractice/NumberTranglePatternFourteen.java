package com.day24.java8ProgramsPractice;

// Reverse Right Half Pyramid Pattern
// This prints a right-aligned triangle but in reverse top to bottom.

public class NumberTranglePatternFourteen {

	public static void printPattern(int n) {
		int i, j;

		for (i = n; i >= 1; i--) {

			for (j = 1; j <= i; j++) {
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
