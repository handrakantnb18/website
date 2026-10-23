package com.day23.javaProgramsPractice;

// This prints a left pyramid in reverse, starting from full-width and decreasing

public class ReverseLeftTestFive {

	public static void printPattern(int n) {
		int i, j;

		for (i = n; i > 0; i--) {

			for (j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 7;
		printPattern(n);

	}
}
