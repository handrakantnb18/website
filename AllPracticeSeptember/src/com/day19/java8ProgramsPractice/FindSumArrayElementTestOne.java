package com.day19.java8ProgramsPractice;

// Iterative Method (Using Loop) Initialize a variable sum to 0

public class FindSumArrayElementTestOne {

	static int arr[] = {12, 3, 4, 15};
    static int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
    
	public static void main(String[] args) {
		
		System.out.println("Sum of given arrays is  : "+sum());
		
	}
}
