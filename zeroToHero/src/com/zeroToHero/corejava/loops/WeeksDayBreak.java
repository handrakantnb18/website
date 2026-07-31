package com.zeroToHero.corejava.loops;

public class WeeksDayBreak {

	public static void main(String[] args) {
		
		int days = 2;
		
		switch(days) {
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednsday");
			break;
			
		case 5:
			System.out.println("Thrusdat");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
			default :
				System.out.println(days);
		}
	}
}
