package com.day24.java8ProgramsPractice;

import java.util.Arrays;
import java.util.List;

// use a lambda expression to simplify the implementation of a functional interface.

public class LambdaTest {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(
				1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		
		num.forEach(num1 -> System.out.print(num1+" "));
		
	}
}
