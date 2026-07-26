package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversesString {

	public static void main(String[] args) {
		
		
		 String str = "My name is chandrakant";
         
	        String rev = 
	        		Arrays.stream(str.split(" "))
	                    .map(word -> new StringBuffer(word)
	                    		.reverse())
	                        .collect(Collectors.joining(" "));
	         
	        System.out.println(rev);
	        
	}
}
