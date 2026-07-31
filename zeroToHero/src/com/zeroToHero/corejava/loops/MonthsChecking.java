package com.zeroToHero.corejava.loops;

public class MonthsChecking {

	public static void main(String[] args) {
		
		int month = 7;
		
		String monthNum = "";
		
		switch(month) {
		
		case 1:
			monthNum= "1- January";
			break;
			
		case 2:
			monthNum= "2- february";
			break;
			
		case 3:
			monthNum= "3- March";
			break;
			
		case 4:
			monthNum= "4- April";
			break;
			
		case 5:
			monthNum= "5- May";
			break;
			
		case 6:
			monthNum= "6- June";
			break;
			
		case 7:
			monthNum= "7- July";
			break;
			
		case 8:
			monthNum= "8- Augest";
			break;
			
		case 9:
			monthNum= "9- September";
			break;
			
		case 10:
			monthNum= "10- Octomber";
			break;
			
		case 11:
			monthNum= "11- November";
			break;
			
		case 12:
			monthNum= "12- December";
			break;
			
			default :
				System.out.println("Invalied months");
		}
		System.out.println(monthNum);
		
		
	}
}
