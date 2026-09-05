package com.day5.java17features;

import java.util.Arrays;
import java.util.List;

// we use a lambda expression to simplify the implementation of
// a functional interface.

public class LambdaExprDrawTwo {

	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
		 
		 numbers.forEach(number -> System.out.print(number + " ")); 
		 
	}
}
