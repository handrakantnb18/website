package com.day8.java8ProgramsPractice;

// Write a Java program to 𝐦𝐨𝐯𝐞 𝐚𝐥𝐥 𝐳𝐞𝐫𝐨𝐬 𝐭𝐨 𝐭𝐡𝐞 𝐞𝐧𝐝 of an 
//array while maintaining the order of non-zero elements.
public class NonZeroElements {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 3, 12};
		int index = 0;
		
		for(int num : arr) {
			if(num != 0) {
				arr[index++] = num;
			}
		}
		
		while (index < arr.length) {
			arr[index++] = 0;
		}
		
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}
