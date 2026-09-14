package com.day14.java8ProgramsPractice;

// The finally statement lets you execute code, after try...catch

public class TryCatchFinallyTestOne {

	public static void main(String[] args) {

		try {
			int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.println(num[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		} finally {
			System.out.println("The 'try catch' is finished");
		}
	}
}
