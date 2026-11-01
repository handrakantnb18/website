package com.day1.java;

import java.math.BigInteger;
import java.util.ArrayList;

// to use an arbitrary-precision integer to store the factorial

public class FactorialCalculate {

	public static ArrayList<Integer> factorial(int n) {
		BigInteger fact = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}

		ArrayList<Integer> ans = new ArrayList<>();

		for (char ch : fact.toString().toCharArray()) {
			ans.add(ch - '0');
		}

		return ans;
	}

	public static void main(String[] args) {

		int n = 15;

		ArrayList<Integer> ans = factorial(n);

		System.out.println(ans);

	}
}
