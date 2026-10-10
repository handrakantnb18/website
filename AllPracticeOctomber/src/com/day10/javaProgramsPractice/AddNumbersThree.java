package com.day10.javaProgramsPractice;

// Add Two Numbers Using Bit Manipulation

public class AddNumbersThree {

	public static void main(String[] args) {

		int a = 15;
		int b = 25;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}

		System.out.println("Sum = " + a);

	}

}
