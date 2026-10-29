package com.day29.javaProgramsPractice;

// 2. Check Whether a String Is a Palindrome

public class PalindromeStringTwo {

	public static void main(String[] args) 
	{
		
		String str = "madam";
		
		boolean isPalindrome = true;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != 
					str.charAt(str.length() - 1 - i))
			{
				isPalindrome = false;
				break;
			}
		}

		System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
	}

}
