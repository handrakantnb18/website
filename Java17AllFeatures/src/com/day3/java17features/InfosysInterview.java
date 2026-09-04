package com.day3.java17features;

// Input: `{3, 4, -1, 1}`
// Output: `2`
// Because the positive numbers should start from `1, 2, 3, 4...`, and `2` is the first missing number.
// 𝗔𝗻𝗼𝘁𝗵𝗲𝗿 𝗘𝘅𝗮𝗺𝗽𝗹𝗲: Input: '{1, 2, 0}`
// Output: `3`
// 𝗪𝗵𝘆 𝗶𝘀 𝘁𝗵𝗶𝘀 𝗾𝘂𝗲𝘀𝘁𝗶𝗼𝗻 𝗶𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁?
// Tests array manipulation skills
// Checks handling of negative numbers and duplicates
// Tests your ability to optimize space
// Requires careful thinking about edge cases
// Can you solve it in 𝐎(𝐧) 𝐭𝐢𝐦𝐞 𝐚𝐧𝐝 𝐎(1) extra space ?
// Would you use sorting, a HashSet, or an in-place approach?

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
