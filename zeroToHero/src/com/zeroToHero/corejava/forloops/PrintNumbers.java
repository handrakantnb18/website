package com.zeroToHero.corejava.forloops;

public class PrintNumbers {

	public static void main(String[] args) {
		
		// Printing Numbers from 1 to 10
		int i= 1;
		while(i<= 10) {
			System.out.println("Print Numbers : "+i);
			i++;
		}
		
		// Printing Row and Column Values
		System.out.println("=======================");
		int a=1;
		
		while(a<=3) {
			
			int b=3;
			while(b<=5) {
				System.out.println("Row and Column : "+a+" "+b);
				b++;
			}
			a++;
		}
	}
}
