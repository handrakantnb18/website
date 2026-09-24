package com.day24.java8ProgramsPractice;

// Butterfly Star Pattern
// Prints a butterfly-shaped pattern using stars (*)

public class NumberTranglePatternEleven {

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n; j++) {

				if (j > i && j <= 2 * n - i) {
					System.out.print(" ");
				}

				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2 * n; j++) {

				if (j > i && j <= 2 * n - i) {
					System.out.print(" ");
				}

				else {
					System.out.print("*");
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
