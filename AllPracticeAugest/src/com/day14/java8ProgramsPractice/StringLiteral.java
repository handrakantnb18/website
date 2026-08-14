package com.day14.java8ProgramsPractice;

public class StringLiteral {

	public static void main(String[] args) {
		
		//Java Program to create string using string literal
		// literal
		String s1 = "Welcome";
		String s2 = "welcome";
		System.out.println(s1+" "+s2);
		
		//Java Program to create string using new keyword  
		// new keyword
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		System.out.println(s3+" "+s4);
		
		// demonstrate how to find string length.
		String s5 = "chandrakant bhosale";
		System.out.println("Lenght of string : "+s5.length());
		
		// find a character in a string
		String s6 = "i an form pune";
		System.out.println("Index of 'p' : "+s6.indexOf('p'));
		
		// how to compare strings.
		String s7 = "Apple";
		String s8 = "Banana";
		
		System.out.println("Equals() method : "+s7.equals(s8));
		System.out.println("CompareTo result : "+s7.compareTo(s8));
		
		String s9 = "Banana";
		String s10 = "Banana";
		
		System.out.println("Equals() method : "+s9.equals(s10));
		System.out.println("CompareTo result : "+s9.compareTo(s10));
		
		// how to concatenate strings.
		
		String str1 = "chandrakant";
		String str2 = " Bhosale";
		
		String combine = str1.concat(str2);
		
		System.out.println("Concated String : "+combine);
		
		
	}
}
