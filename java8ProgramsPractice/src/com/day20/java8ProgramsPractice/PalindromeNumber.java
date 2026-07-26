package com.day20.java8ProgramsPractice;

import java.util.stream.IntStream;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String str = "abcdcba";
		
		 boolean isItPalindrome = IntStream.range(0, str.length()/2).
	                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));
	       
		 if(isItPalindrome)
		 {
			 System.out.println(str+ " is a paliandrome String");
		 }
		 else
		 {
			 System.out.println(str+" is not paliandrom String");
		 }
	}
}
