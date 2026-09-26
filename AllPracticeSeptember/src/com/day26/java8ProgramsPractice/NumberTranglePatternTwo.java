package com.day26.java8ProgramsPractice;

//Prints a pyramid where each row contains numbers from 1 to the row number
//Number-Increasing Pyramid Pattern 

public class NumberTranglePatternTwo {

	public static void printPattern(int n) {
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 6;
		printPattern(n);

	}

}
