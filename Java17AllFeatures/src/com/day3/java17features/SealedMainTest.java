package com.day3.java17features;

sealed class Human permits Manish, Vartika, Anjali {
	
	public void printName() {
		System.out.println("Default");
	}
}

non-sealed class Manish extends Human {
	
	@Override
	public void printName() {
		System.out.println("Chandrakant Bhosale");
	}
}

non-sealed class Vartika extends Human {

    @Override
    public void printName() {
        System.out.println("Shivraj Bhosale");
    }
}

final class Anjali extends Human {
	
	@Override
	public void printName() {
		System.out.println("Priyanka Bhosale");
	}
}

public class SealedMainTest {

	public static void main(String[] args) {
		
		Human h1 = new Anjali();
		Human h2 = new Vartika();
		Human h3 = new Manish();
		
		h1.printName();
		h2.printName();
		h3.printName();
	}
}
