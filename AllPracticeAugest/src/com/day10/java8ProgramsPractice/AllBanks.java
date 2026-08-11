package com.day10.java8ProgramsPractice;

//where three classes are overriding the method of a parent class.
//Creating a parent class.

class Bank{
	int getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfIntrest() {
		return 8;
	}
}

class ICICI extends Bank {
	 int getRateOfIntrest() {
		 return 7;
	 }
}

class AXIS extends Bank {
	int getRateOfIntrest() {
		return 9;
	}
}

//Create a Main class to create objects and call the methods
public class AllBanks {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("  SBI Rate of Interest : "+s.getRateOfIntrest());
		System.out.println("ICICI Rate of Interest : "+i.getRateOfIntrest());
		System.out.println(" AXIS Rate of Interest : "+a.getRateOfIntrest());
		
	}
}
