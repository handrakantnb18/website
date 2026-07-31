package com.zeroToHero.corejava.forloops;

import java.util.Scanner;

public class PreventingInfiniteLoop {

	public static void main(String[] args) {
		
		// prevent infinite loops with a while loop
		int count = 0;
		
		while(count < 5) {
			System.out.println("Count : "+count);
			count++;
		}
		
		// Java Infinitive do-while Loop
		
		 Scanner sc = new Scanner(System.in);  
		 
		 int n;
		 int s =0;
		 int c= 0;
		 
		 System.out.println("Welcome to the Do-While Loop Program!");
		 
		 do {
	            System.out.print("Please enter the"
	            		+ " value of a and n (or -1 to exit): ");  
	            
	            n = sc.nextInt();
	            
	            if(n != -1) {
	            	s += n;
	            	c++;
	            }

		 }while(n != -1);
		 
	        System.out.println("Sum of the numbers entered: " + s);  

	        System.out.println("Number of iterations: " + c);  

	        double average = (double) s / c;  

	        System.out.println("Average of the numbers entered: " + average);  

	        sc.close();
		 
	}
}
