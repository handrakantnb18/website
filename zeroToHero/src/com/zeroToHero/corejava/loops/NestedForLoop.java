package com.zeroToHero.corejava.loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		// Nested for Loop
		for(int i=1; i<=3;i++) {
			
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
		
		// Java program to print pyramid using for loop  
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
