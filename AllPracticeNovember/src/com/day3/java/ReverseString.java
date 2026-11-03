package com.day3.java;

public class ReverseString {

	public static void main(String[] args) {

		// Reverse a String Using StringBuilder
		
		String str = "Chandrakant";

		String reverse = new StringBuilder(str).reverse().toString();

		System.out.println("Original String: " + str);
		System.out.println("Reverse String: " + reverse);

		// Reverse a String Using for loop
		
		String str1 = "Chandrakant";
        String reverse1 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {

            reverse1 = reverse1 + str1.charAt(i);
        }

        System.out.println(reverse1);
		
	}
}
