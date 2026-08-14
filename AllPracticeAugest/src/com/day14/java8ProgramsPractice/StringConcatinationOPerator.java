package com.day14.java8ProgramsPractice;

public class StringConcatinationOPerator {

	public static void main(String[] args) {
		
		// using the + operator between them
		String str1 = "chandraaknt "+"bhosale";
		System.out.println(str1);
		
		// concatenate not only String but also primitive values.
		String str2 = 10 + 20 + " Priyanka " + 30 + 40;
		System.out.println(str2);
		
		// Using the String.concat() Method
		String str3 = "Shivaraj ";
		String str4 = "Bhosale";
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		// to concatenate more than two strings.
		String s1 = "Adam ";    
		String s2 = "Craig ";  
		String s3 = "Gilchrist";  
		String s4 = s1.concat(s2).concat(s3);    
		System.out.println(s4);   
	}
}
