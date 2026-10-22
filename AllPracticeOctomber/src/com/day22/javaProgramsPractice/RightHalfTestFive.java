package com.day22.javaProgramsPractice;

// This creates a right-angled triangle aligned to the left using stars

public class RightHalfTestFive {

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
