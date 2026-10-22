package com.day22.javaProgramsPractice;

// reverse pyramid where each row starts from 1 and ends at the row count

public class NumberPyramidReverseTestFour {

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

		int n = 8;
		printPattern(n);

	}
}
