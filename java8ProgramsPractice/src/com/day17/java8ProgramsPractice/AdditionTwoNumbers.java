package com.day17.java8ProgramsPractice;

interface Add
{
	int addition(int a, int b);
}

public class AdditionTwoNumbers {

	public static void main(String[] args) {
		
		Add add = (a, b) -> a + b;
		
		int result = add.addition(25, 35);
		System.out.println("Sum : "+result);
		
	}
}
