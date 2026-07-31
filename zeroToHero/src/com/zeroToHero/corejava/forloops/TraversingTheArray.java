package com.zeroToHero.corejava.forloops;

public class TraversingTheArray {

	public static void main(String[] args) {
		
		 //traversing the array with for-each loop  
		int arr[] = {12,13,14,44};
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		// Calculating Sum of Array Elements
		
		int arr1[] = {12,13,14,44};
		int total=0;
		
		for(int j:arr1) {
			total =total+j;
		}
		
		System.out.println("Total : "+total);
		
	}
}
