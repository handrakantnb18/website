package com.day14.java8ProgramsPractice;

public class CharArrayToString {

	public static void main(String[] args) {
		
		//  creating (constructing) a string from the subset of a character array.
		char[] charArray = {'c','h','a','n','d','r','a','k','a','n','t'};
		
		String result = new String(charArray, 6, 5);
		
		System.out.println(result);
		
		// creating (constructing) a string from a character array (char[] Array).
		
		String str1 = "java";
		
		char ch[] = {'s','t','r','i','n','g','s'};
		String str2 = new String(ch);
		String str3 = new String("example");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}
}
