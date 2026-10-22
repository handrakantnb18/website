package com.day22.javaProgramsPractice;

// Prints a rhombus (tilted square) made of stars, shifted by spaces.

public class RhombusPatternTestOne {

	public static void printPattern(int n) {
		int i, j;
		int num = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= n; j++) {
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
