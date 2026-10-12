package com.day12.javaProgramsPractice;

// Create a result matrix with columns rows and rows columns.

public class SumofArrayTestEight {

	static void transpose(int[][] A, int[][] B) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				B[j][i] = A[i][j];
			}
		}
	}

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int rows = A.length;
		int cols = A[0].length;

		int[][] B = new int[cols][rows];

		transpose(A, B);

		for (int[] row : B) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}
}
