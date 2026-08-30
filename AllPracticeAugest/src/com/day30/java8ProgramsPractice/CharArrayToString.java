package com.day30.java8ProgramsPractice;

//Constructing String from Subset of Char Array
public class CharArrayToString {

	public static void main(String[] args) {
		
		char[] charArray = {'H','e','l','l','o',' ','W','o','r','l','d'};
		
		String resString = new String(charArray, 6, 5);
		
		System.out.println(resString);
		
	}
}
