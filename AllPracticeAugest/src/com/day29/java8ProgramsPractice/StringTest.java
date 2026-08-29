package com.day29.java8ProgramsPractice;

// java String is immutable which means it cannot be changed
// we change any string, a new instance is created
// string is a sequence of characters

public class StringTest {

	public static void main(String[] args) {
		
		String s1 = "Chandrakant";
		String s2 = "Chandrakant";
		
		System.out.println(s1+ " = " +s2);
		
		// Creating String Using new Keyword
		// explicitly creates a new String object in memory
		// rather than using the string literal pool.
		
		String str1 = new String("Welcome");
		String str2 = new String("Welcome");
		
		System.out.println(str1+" = "+str2);
		
		// Finding String Length
		
		String str3 = "Chandrakant bhosale";
		System.out.println("Length of String : "+str3.length());
		
		// Finding a Character in a String
		System.out.println("Index of 'O' : "+str3.indexOf('o'));
		
		// Comparing Strings
		
		String string1 = "Apple";
		String string2 = "Banana";
		
		System.out.println("Equals : "+ string1.equals(string2));
		System.out.println("CompareT result : "+ string1.compareTo(string2));
		
		// Concatenating Strings
		
		String comb = string1.concat("").concat(string2);
		
		System.out.println("Concatenated String : "+comb);
		
		// Java String Immutability
		
		
		
	}
}
