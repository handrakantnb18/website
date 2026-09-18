package com.day18.java8ProgramsPractice;

// we will implement a Java program to print the square 
// star pattern. We will print the square star pattern
// with diagonals and without diagonals.

public class PyramidPatternTestTwo {

	static void print_rectangle(int k, int l) {
		int a, b;

		for (a = 1; a <= k; a++) {

			for (b = 1; b <= l; b++) {

				if (a == 1 || a == k || b == 1 || b == l)

					System.out.print("* ");

				else

					System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int rows = 8, columns = 22;

		print_rectangle(rows, columns);

	}
}

//	output: 
//
//	**********************
//	*                    *
//	*                    *
//	*                    *
//	*                    *
//	*                    *
//	*                    *
//	**********************
