package com.day14.java;

//NullDataCheck Test yourself by guessing the output of the following code

public class NullDataCheck {

	public static void main(String[] args) {

		String str = null;
		String str1 = "abc";

		System.out.println(str1.equals("abc") 
				| str.equals(null));

	}
}
