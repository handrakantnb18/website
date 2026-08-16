package com.zeroToHero.exception;

// we have declared a final variable age. Once declared, it cannot be modified.

public class FinalKeywordTest {

	final int age = 25;
	void display() {
		int age = 27; // without int datatype compile time error
	}
	
	public static void main(String[] args) {
		
		FinalKeywordTest ft = new FinalKeywordTest();
		ft.display();
	}
}
