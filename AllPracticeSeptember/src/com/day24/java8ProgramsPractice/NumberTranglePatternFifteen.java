package com.day24.java8ProgramsPractice;

// Left Half Pyramid Pattern
// This pattern aligns a triangle to the right by adding spaces before stars

public class NumberTranglePatternFifteen {

	public static void printPattern(int n) {
		int i, j;

		for (i = n; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (j = 0; j <= n - i; j++) {
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
