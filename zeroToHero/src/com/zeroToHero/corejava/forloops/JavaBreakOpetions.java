package com.zeroToHero.corejava.forloops;

import java.util.Scanner;

public class JavaBreakOpetions {

	// use of the break statement in a switch statement. 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the option : ");
		System.out.println("1. Option 1 ");
		System.out.println("2. Option 2 ");
		System.out.println("3. Option 3 ");
		System.out.println("4. Exit ");
		
		while(true) {
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Your choice Option 1");
				break;
				
			case 2:
				System.out.println("Your choice Option 2");
				break;
				
			case 3:
				System.out.println("Your choice Option 3");
				break;
				
			case 4:
				System.out.println("Exist..");
				sc.close();
				return;
				
				default :
					System.out.println("Invalid choice...");
					break;
			}
		}
	}
}
