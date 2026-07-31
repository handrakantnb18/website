package com.zeroToHero.corejava.forloops;

public class BreakStatement {

	public static void main(String[] args) {
		
		// break Statement Value found at index 
		int[] arr = {1,2,3,4,5,6};
		int target = 3;
		
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.println("Value of index : "+i);
				break;
			}
		}
		
		// 
		
		for(int j=1; j<=10; j++) {
			if(j == 5) {
				break;
			}
			
			System.out.println(j);
			
		}
	}
}
