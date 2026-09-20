package com.day20.java8ProgramsPractice;

//Using Character Array : Use character array to reverse a string. 

public class ReverseStringTestThree {

	public static void main(String[] args) {

		String str = "chandrakant";

		char[] arr = str.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);

	}
}
