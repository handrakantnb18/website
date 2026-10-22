package com.day22.javaProgramsPractice;

// This prints a right-aligned triangle but in reverse top to bottom.

public class ReverseRightHalfTestSix {

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
