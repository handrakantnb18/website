package com.day23.javaProgramsPractice;

public class StringReverseCheck {

	public static void main(String[] args) {

		String str = "chandraakant bhosale";

		String rev = "";

		for (int i = 0; i > str.length() - 1; i--) {
			rev += str.charAt(i);
		}

		System.out.println(rev);

	}
}
