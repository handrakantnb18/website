package com.day21.java8ProgramsPractice;

// Let n be the number of rows to be printed

public class PyramidPatternTestFour {

	public int factorial(int a) {

		if (a == 0)

			return 1;

		return a * factorial(a - 1);
	}

	public static void main(String[] args) {

		int k = 4;

		int a, b;

		PyramidPatternTestFour pattern = new PyramidPatternTestFour();

		for (a = 0; a <= k; a++) {

			for (b = 0; b <= k - a; b++) {

				System.out.print(" ");
			}

			for (b = 0; b <= a; b++) {
				System.out.print(" " + pattern.factorial(a) / (pattern.factorial(a - b) * pattern.factorial(b)));
			}

			System.out.println();

		}
	}
}

//		Output
//		
//		    1
//		   1 1
//		  1 2 1
//		 1 3 3 1
//		1 4 6 4 1
