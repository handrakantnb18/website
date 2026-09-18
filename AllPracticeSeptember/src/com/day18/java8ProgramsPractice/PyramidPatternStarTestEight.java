package com.day18.java8ProgramsPractice;

// Declaring and initializing variables
// Variable initialized to the row where max star
// should be there as after that they decreases to
// give diamond pattern

public class PyramidPatternStarTestEight {

	public static void main(String[] args) {

		int number = 7;

		int m, n;

		for (m = 1; m <= number; m++) {

			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}

			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (m = number - 1; m > 0; m--) {

			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}

			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}


//  output :

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
