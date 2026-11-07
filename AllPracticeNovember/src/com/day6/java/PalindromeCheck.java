package com.day6.java;

// Write a program to check if a given string is a palindrome

public class PalindromeCheck {

//	public static boolean isPalindrome(String str) {
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
        
	//public static void main(String[] args) {

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
