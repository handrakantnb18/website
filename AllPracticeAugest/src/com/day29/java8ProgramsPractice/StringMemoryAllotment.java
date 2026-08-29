package com.day29.java8ProgramsPractice;

public class StringMemoryAllotment {

	public static void main(String[] args) {
		
		// String literals - stored in the string pool 
		 String str1 = "Java";  
	     String str2 = "Java";
	        
	     System.out.println("str1 == str2: " + (str1 == str2));
	     
	     String str3 = new String("Java");  
	     String str4 = new String("Java");  
	        
	     System.out.println("str3 == str4: " + (str3 == str4));
	     
	     String str5 = str3.intern();
	     
	     // Demonstrating the effect of interning on memory allocation  
	     System.out.println("str1 == str5: " + (str1 == str5));
	     
	     String str6 = new String("Java").intern();  
	     
	     System.out.println("str1 == str6: " + (str1 == str6));
	     
	}
}
