package com.day1.java17features;

 class MainPatternInstanceOf {

	static String describe(Object o) {
		if (o instanceof String s)
			return "String Length = " + s.length();
		
		if (o instanceof Number n)
			return "Number double = "+n.doubleValue();
		return "Unknown";
	}
	public static void main(String[] args) {
		
		System.out.println(describe("Hellomynameischandrakantbhosale"));
		System.out.println(describe(55));
	}
}
