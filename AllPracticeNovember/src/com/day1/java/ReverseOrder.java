package com.day1.java;

import java.util.ArrayList;
import java.util.Collections;

//  large for standard integer types, each digit is stored separately.

public class ReverseOrder {

	static ArrayList<Integer> factorial(int n) {

		ArrayList<Integer> res = new ArrayList<>();
		res.add(1);

		for (int x = 2; x <= n; x++) {
			int carry = 0;

			for (int i = 0; i < res.size(); i++) {
				int prod = res.get(i) * x + carry;

				res.set(i, prod % 10);
				carry = prod / 10;
			}

			while (carry != 0) {
				res.add(carry % 10);
				carry /= 10;
			}
		}

		Collections.reverse(res);

		return res;
	}

	public static void main(String[] args) {

		int n = 15;

		ArrayList<Integer> ans = factorial(n);

		System.out.print("[");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i));

			if (i + 1 < ans.size())
				System.out.print(", ");
		}
		
		System.out.print("]");

	}
}
