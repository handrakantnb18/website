package com.day18.java8ProgramsPractice;

// Print the upper half by increasing the number of stars in each row.
// Print the required leading spaces before the stars.

public class PyramidPatternStarTestSix {

	public static void main(String[] args) {

		int number = 7;

		int m = 1;

		int n;

		do {
			n = 1;

			do {

				System.out.print(" ");

			}

			while (++n <= number - m + 1);

			n = 1;

			do {

				System.out.print("*");
			}

			while (++n <= m * 2 - 1);

			System.out.println();

		}

		while (++m <= number);

		m = number - 1;

		do {
			n = 1;

			do {

				System.out.print(" ");

			} while (++n <= number - m + 1);

			n = 1;

			do {

				System.out.print("*");

			} while (++n <= m * 2 - 1);

			System.out.println();

		}

		while (--m > 0);

	}
}

//		Input: number = 7 
//		
//		Output:

//			      *
//			     ***
//			    *****
//			   *******
//			  *********
//			 ***********
//			*************
//			 ***********
//			  *********
//			   *******
//			    *****
//			     ***
//			      *

