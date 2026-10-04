package com.day3.javaProgramsPractice;

// The loop should start at the last index and decrement.

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		String rev = " ";
		
		for(int i = str.length() - 1;  i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println(rev);
	}
}
