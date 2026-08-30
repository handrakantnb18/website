package com.day30.java8ProgramsPractice;
// Similar to StringBuilder, StringBuffer also has the 
// reverse() method for reversing the string.
public class ReverseStringStringBufferSeven {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		StringBuffer sf = new StringBuffer();
		sf.append(str);
		sf.reverse();
		System.out.println("Original String : "+str);
		
		System.out.println("Reverse String : "+sf);
	}
}
