package com.day14.java8ProgramsPractice;

// Runtime errors occur when the program compiles but crashes or behaves unexpectedly.

public class RuntimeErrorTestOne {

	public static void main(String[] args) {
		
		int a = 10;
		// int b = 0;
		
		int b = 5;
		
		int num = a / b;
		
		System.out.println(num);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(arr[18]);
		
	}
}
