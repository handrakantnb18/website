package com.zeroToHero.corejava.loops;

public class PrintPyraminStarPattern {

	public static void main(String[] args) {
		// Java program to print pyramid or star pattern using for loop 
		
		int py=6;
		
		for(int i=1;i<=py;i++) {
			for(int j=py;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
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
