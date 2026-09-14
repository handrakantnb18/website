package com.day14.java8ProgramsPractice;

// An anonymous class is a class without a name. It is created 
// and used at the same time.

class AnimalAn {
	  public void makeSound() {
	    System.out.println("Animal sound");
	  }
	}


public class AnonymousClassTestOne {

	public static void main(String[] args) {
		
		AnimalAn a = new AnimalAn() {
		      public void makeSound() {
		        System.out.println("Woof woof, kasicfjhihci");
		      }
		};
		
		a.makeSound();
		
	}
}
