package com.day12.javaProgramsPractice;

// Java Program to Print Star Pascal’s Triangle

public class PyramidPatternTestFour {

	public int factorial(int a) {
		if (a == 0)

			return 1;

		return a * factorial(a - 1);
	}

	public static void main(String[] args) {

		int k = 4;

		int a, b;

		PyramidPatternTestFour g = new PyramidPatternTestFour();

		for (a = 0; a <= k; a++) {

			for (b = 0; b <= k - a; b++) {

				System.out.print(" ");
			}

			for (b = 0; b <= a; b++) {

				System.out.print(" " + g.factorial(a) / (g.factorial(a - b) * g.factorial(b)));
			}

			System.out.println();
		}

	}
}
