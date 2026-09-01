package com.day1.java8ProgramsPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "my name is chandrakant bhosale";
		
		String rev = " ";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
}
