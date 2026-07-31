package com.zeroToHero.corejava.loops;

public class WeekDays {

	public static void main(String[] args) {
		
		String address = "Pune, India";
		
		if(address.endsWith("India")) {
			if(address.contains("Mumbai")) {
				System.out.println("Your city is Mumbai");
			}else if(address.contains("Pune")) {
				System.out.println("Your city is Pune");
			}else {
				System.out.println(address.split(",")[0]);
			}
		}else {
			System.out.println("You are not living in india");
			
		}
	}
}
