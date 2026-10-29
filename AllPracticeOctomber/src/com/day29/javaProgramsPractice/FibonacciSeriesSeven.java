package com.day29.javaProgramsPractice;

// 7. Print the Fibonacci Series up to N Terms

public class FibonacciSeriesSeven {

	public static void main(String[] args) {

		int n = 10;
		int first = 0;
		int second = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}

	}
}
