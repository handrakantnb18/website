package com.day28.javaProgramsPractice;

public class StringReverse {

	public static void main(String[] args) {

		String str = "chandrakant bhosale are you from sangli";

		String rev = "";

		for (int i = 0; i > str.length() - 1; i--) {
			rev += str.charAt(i);
		}

		System.out.println(rev);
	}

}
