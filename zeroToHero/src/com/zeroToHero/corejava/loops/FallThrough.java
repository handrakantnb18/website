package com.zeroToHero.corejava.loops;

public class FallThrough {

	public static void main(String[] args) {
		
		int num = 25;
		
		switch(num) {
		case 15:
			System.out.println("15");
			
		case 25:
			System.out.println("25");
			
		case 35:
			System.out.println("35");
			
			default: 
				System.out.println("Not in 15, 25, or 35");
				
		}
	}
}
