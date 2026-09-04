package com.day3.java17features;

import java.util.HashSet;
import java.util.Set;

// Write a Java program to find the 𝐅𝐢𝐫𝐬𝐭 𝐌𝐢𝐬𝐬𝐢𝐧𝐠 𝐏𝐨𝐬𝐢𝐭𝐢𝐯𝐞 𝐍𝐮𝐦𝐛𝐞𝐫 from an unsorted array.

public class InfosysInterview {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, -1, 1};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int n : arr)
			if(n > 0)
				set.add(n);
		
		int i = 1;
		
		while (set.contains(i))
			 i++;
		
		System.out.println("Fist missing position : "+ i);
		
	}
}
