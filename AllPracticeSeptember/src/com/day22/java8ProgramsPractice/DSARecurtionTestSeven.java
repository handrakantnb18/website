package com.day22.java8ProgramsPractice;

//Recursion is a technique where a method 
//calls itself to solve smaller subproblems

public class DSARecurtionTestSeven {

	static int fact(int n) {

		if (n == 0)
			return 1;

		return n * fact(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(fact(5));
	}
}
