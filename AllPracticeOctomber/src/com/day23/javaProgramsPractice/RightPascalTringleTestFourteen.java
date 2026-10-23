package com.day23.javaProgramsPractice;

// Forms a right-angled triangle pointing upward and downward, creating a right Pascal’s triangle shape

public class RightPascalTringleTestFourteen {

	public static void printPattern(int n) {

		int i, j;

		int num = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (i = n - 1; i >= 1; i--) {

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int n = 7;
		printPattern(n);

	}
}
