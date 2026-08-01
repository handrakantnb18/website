package com.zeroToHero.corejava.oopsConcepts;

// we are displaying the state (data) of the objects by invoking the displayInformation() method.

class Std {
	
	int rollno;
	
	String name;
	
	void insertRecord(int r, String s) {
		rollno = r;
		name = s;
	}
	
	void displayInformation() {
		System.out.println(rollno+ " "+name);
	}
}

public class MainObject {

	public static void main(String[] args) {
		
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.insertRecord(1, "Amol");
		s2.insertRecord(2, "Pooja");
		
		s1.displayInformation();
		s2.displayInformation();
		
	}
}
