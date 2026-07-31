package com.zeroToHero.corejava.loops;

public class PrintTableLoop {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=============");
		int num = 5;
		
		int facto = 1;
		
		for(int i =1; i<= num; i++)
		{
			facto *= i;
		}
		
		System.out.println("Factorial of "+ num + " is"+facto);
		
	}
}
