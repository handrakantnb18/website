package com.day18.java8ProgramsPractice;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter serch Elements : ");
		int search = sc.nextInt();
		
		boolean found = false;
		
		for (int i =0 ; i < arr.length; i++) {
			
			if(arr[i] == search) {
				System.out.println("Elements "+search + " found at index : "+ i);
				
				found = true;
				
				
			}
		}
		
		if(!found) {
			System.out.println("Elements not found.");
		}
		
		sc.close();
	}
}
