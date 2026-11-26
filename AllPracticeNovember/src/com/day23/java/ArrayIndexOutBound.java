package com.day23.java;

// What will be the output of the program

public class ArrayIndexOutBound {

	public static void main(String[] args) {

		try {
			int[] arr = new int[2];
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block executed");
		}

	}
}
