package com.day29.javaProgramsPractice;

// 1. Reverse a String Without Using Built-in Reverse Methods

public class ReverseStringOne {

	public static void main(String[] args) {

		String str = "Java";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println(reversed);

	}
}
