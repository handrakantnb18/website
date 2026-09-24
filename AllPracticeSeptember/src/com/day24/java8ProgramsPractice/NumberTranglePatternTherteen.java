package com.day24.java8ProgramsPractice;

// Right Half Pyramid Pattern
// This creates a right-angled triangle aligned to the left using stars.

public class NumberTranglePatternTherteen {

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

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
