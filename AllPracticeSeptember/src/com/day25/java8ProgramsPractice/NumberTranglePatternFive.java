package com.day25.java8ProgramsPractice;

// Hollow Hourglass Pattern
// Displays a hollow hourglass using stars, where only boundary
// stars are visible in a symmetric hourglass shape

public class NumberTranglePatternFive {

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (j = i; j <= n; j++) {
				if (j == i || j == n || i == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

		for (i = n - 1; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (j = i; j <= n; j++) {
				if (j == i || j == n || i == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}
}
