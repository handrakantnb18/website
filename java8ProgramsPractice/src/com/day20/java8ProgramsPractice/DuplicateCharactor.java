package com.day20.java8ProgramsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharactor {

	public static void main(String[] args) {
		
		 String str = "Java Concept Of The Day"
				 .replaceAll("\\s+", "").toLowerCase();
         
	        Set<String> uniChars = new HashSet();
	         
	        Set<String> duplicat = 
	                Arrays.stream(str.split(""))
	                        .filter(ch -> ! uniChars.add(ch))
	                        .collect(Collectors.toSet());
	         
	        System.out.println(duplicat);
	}
}
