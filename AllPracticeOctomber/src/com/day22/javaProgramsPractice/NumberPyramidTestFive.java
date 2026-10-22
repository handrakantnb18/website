package com.day22.javaProgramsPractice;

// Prints a pyramid where numbers increase continuously from top to bottom.

public class NumberPyramidTestFive {

	public static void printPattern(int n) {
		int i, j;
		int num = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(num + " ");

				num++;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}
}
