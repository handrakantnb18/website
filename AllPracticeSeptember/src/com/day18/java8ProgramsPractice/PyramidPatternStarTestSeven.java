package com.day18.java8ProgramsPractice;

// Declaring and initializing variables
// Variable initialized to the row where max star
// should be there as after that they decreases to
// give diamond pattern

public class PyramidPatternStarTestSeven {

	public static void main(String[] args) {

		int number = 7;

		int m = 1;

		int n;

		while (m <= number) {
			n = 1;

			while (n++ <= number - m) {
				System.out.print(" ");
			}

			n = 1;

			while (n++ <= m * 2 - 1) {

				System.out.print("*");

			}

			System.out.println();

			m++;

		}

		m = number - 1;

		while (m > 0) {
			n = 1;

			while (n++ <= number - m) {

				System.out.print(" ");

			}

			n = 1;

			while (n++ <= m * 2 - 1) {

				System.out.print("*");
			}

			System.out.println();

			m--;
		}
	}
}

//  Output

//		      *
//		     ***
//		    *****
//		   *******
//		  *********
//		 ***********
//		*************
//		 ***********
//		  *********
//		   *******
//		    *****
//		     ***
//		      *
