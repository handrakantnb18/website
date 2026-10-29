package com.day29.javaProgramsPractice;

// 6. Check Whether a Number Is Prime

public class PrimeNumberSix {

	public static void main(String[] args) {

		int num = 29;
		boolean isPrime = num >= 2;

		for (int i = 2; i <= num / i; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ?
				"Prime" : "Not Prime");

	}
}
