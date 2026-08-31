package com.day31.java8ProgramsPractice;

// hows how an interface can be used to provide 
// a common structure for related classes.
interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class HDFC implements Bank {
	public float rateOfInterest() {
		return 8.7f;
	}
}

public class InterfaceBank {

	public static void main(String[] args) {
		
		Bank b;
		b = new SBI();
		System.out.println("SBI ROI : "+b.rateOfInterest());
		
		b = new PNB();
		System.out.println("PNB ROI : "+b.rateOfInterest());
		
		b = new HDFC();
		System.out.println("HDFC ROI : "+b.rateOfInterest());
		
	}
}
