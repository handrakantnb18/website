package com.day13.javaProgramsPractice;

// Transpose of a Square Matrix Using Extra Space

public class MatrixTestTwo {

	static void transpose(int[][] A, int[][] B) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				B[j][i] = A[i][j];
			}
		}
	}

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = A.length;
		int[][] B = new int[n][n];

		transpose(A, B);

		for (int[] row : B) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}
}
