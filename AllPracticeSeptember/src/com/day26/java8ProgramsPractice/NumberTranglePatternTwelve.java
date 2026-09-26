package com.day26.java8ProgramsPractice;

//Square Fill Pattern
//This program prints a filled square of stars (*) with n+1 rows and columns

public class NumberTranglePatternTwelve {

	public static void printPattern(int n) {
		int i, j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}

}
