package com.zeroToHero.corejava.loops;

public class PrintingArrayofString {

	public static void main(String[] args) {
		
		String[] frouts = {"Mongo", "Apple", "Graps","Banana", "Orange","Water Milan"};
		System.out.println("Printing Frouts Names : ");
		
		for(String names : frouts) {
			System.out.print(" "+names);
		}
	}
}
