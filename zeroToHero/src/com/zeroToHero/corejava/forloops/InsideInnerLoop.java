package com.zeroToHero.corejava.forloops;

public class InsideInnerLoop {

	public static void main(String[] args) {
		
		// //Java Program to illustrate the use of break statement  
		for(int i =1; i<= 3; i++) {
			for(int j=1; j<= 3; j++) {
				if(i== 2 && j == 2) {
					break;
				}
				
				System.out.println(i+" "+j);
			}
		}
		
		// Java Program to demonstrate the use of break statement 
		
		System.out.println("=============");
		int a =1;
		while(a<=10) {
			if(a==5) {
				a++;
				break;
			}
			
			System.out.println(a);
			a++;
		}
	}
}
