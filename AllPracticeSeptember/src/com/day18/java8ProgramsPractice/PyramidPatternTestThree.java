package com.day18.java8ProgramsPractice;

// Now taking it a step further as in above we simply inserted empty spaces inside the rectangle
// we already have come across diagonals, so we can print them too in the above case.

public class PyramidPatternTestThree {

	static void print_squaredi(int k) {
		int a, b;

		for (a = 1; a <= k; a++) {

			for (b = 1; b <= k; b++) {

				if (a == 1 || a == k || b == 1 || b == k || a == b || b == (k - a + 1))

					System.out.print("* ");

				else

					System.out.print(" ");

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int rows = 12;

		print_squaredi(rows);

	}
}

// output :

//		************
//		**        **
//		* *      * *
//		*  *    *  *
//		*   *  *   *
//		*    **    *
//		*    **    *
//		*   *  *   *
//		*  *    *  *
//		* *      * *
//		**        **
//		************
