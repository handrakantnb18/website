package com.day1.java;

// the case when left max is less than the right max

public class TwoPointerMax {

	static int maxWater(int[] arr) {
		int left = 1;
		int right = arr.length - 2;

		int lMax = arr[left - 1];
		int rMax = arr[right + 1];

		int res = 0;
		while (left <= right) {

			if (rMax <= lMax) {

				res += Math.max(0, rMax - arr[right]);

				rMax = Math.max(rMax, arr[right]);

				right -= 1;
			} else {

				res += Math.max(0, lMax - arr[left]);

				lMax = Math.max(lMax, arr[left]);

				left += 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 3, 1, 0, 4 };

		System.out.println(maxWater(arr));

	}
}
