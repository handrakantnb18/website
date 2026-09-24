package com.day24.java8ProgramsPractice;

// reverse pyramid where each row starts from 1 and ends at the row count
// Number-Increasing Reverse Pyramid Pattern

public class NumberTranglePatternThree {

	public static void printPattern(int n) {
		int i, j;

		for (i = n; i >= 1; i--) {

			for (j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}
}
