package com.day30.java8ProgramsPractice;

// The String.getBytes() method works well at the byte level
// reversed; after that, a new string is constructe
//Keep the result in the reverse order into the

public class ReverseStringGetBytesNine {

	public static void main(String[] args) {
		
		String oriStr = "PUNE HINJEWADI";
		
		byte[] arr = oriStr.getBytes();
		byte[] result = new byte[arr.length];
		
		for(int i = 0; i < arr.length; i++)
			result[i] = arr[arr.length - i - 1];
		
		String resStr = new String(result);
		
		System.out.println("Original String : "+oriStr);
		System.out.println("Reverse String :" +resStr);
	}
}
