package com.zeroToHero.corejava.forloops;

import java.util.Scanner;

public class BreakForLoop {

	// Real-World Uses of Java break Statement
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Using break in a for loop: ");
		for(int i = 1; i<=5; i++) {
			System.out.println("Enter number : (or -1 to exit) : ");
			num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			
			System.out.println("You Entered : "+num);
		}
		
		System.out.println("\n Using break in a while loop : ");
		
		int i = 1;
		while(i <= 5) {
		   System.out.println("Enter a number (or -1 to exit ) : " );
		   
		   num = sc.nextInt();
		   
		   if(num == -1) {
			   break;
			   
		   }
		   
		   System.out.println("You entered : "+num);
		   i++;
		}
		
		System.out.println("\n Using break in a do-while loop : ");
		i = 1;
		
		do {
			System.out.println("Enter a number(or -1 to exit) : ");
			num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			
			System.out.println("You entered : "+num);
			i++;
		}
		while(i <= 5);
		sc.close();
		
	}
}
