package com.day18.java8ProgramsPractice;

import java.util.Scanner;

public class SearchElementTwo {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter search Elements : ");
		int search = sc.nextInt();
		
		boolean found = false;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == search) {
				System.out.println("Element "+search+ " found at index : "+i);
				
				found = true;
			}
			
//			else {
//				System.out.println("Elements not found..");
//			}
			
		}
		if(!found) {
			System.out.println("Elements not found..");
		}
		sc.close();
	}
}
