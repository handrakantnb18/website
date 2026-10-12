package com.day12.javaProgramsPractice;

// A square matrix can be transposed without creating another matrix

public class SumofArrayTestTen {

	static void transpose(int[][] A) {

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {

				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		transpose(A);

		for (int[] row : A) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}
}
