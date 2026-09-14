package com.day14.java8ProgramsPractice;

// add more than one catch block, and Java will run the first 
// one that matches the thrown exception

public class MultipleTryCatchTestOne {

	public static void main(String[] args) {

		try {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.println(arr[10]);
			int res = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index does not exist.");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		} catch (Exception e) {
			System.out.println("Something else went wrong.");
		}
	}
}
