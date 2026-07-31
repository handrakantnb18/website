package com.zeroToHero.corejava.forloops;

public class PrintMultiplicationTable {

	// Printing Multiplication Table
	public static void main(String[] args) {
		
		int i =1;
		
		while(i<=10) {
			int j=1;
			while(j<=10) {
				System.out.print(i*j+" | ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		// Java Inifinitive while Loop
		
		System.out.println("============================");
		while(true) {
			System.out.println("Infinitive while loop");
		}
	}
	
}
