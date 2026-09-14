package com.day14.java8ProgramsPractice;

import java.util.Scanner;

// The Scanner class is used to get user input, and it is found in the java.util package.


public class ScannerTestOne {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username : ");

		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);
		
		
	}
}
