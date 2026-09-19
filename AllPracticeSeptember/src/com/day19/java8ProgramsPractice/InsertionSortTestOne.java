package com.day19.java8ProgramsPractice;

//  Program of Insertion Sort Java the implementation of Insertion Sort in Java:

public class InsertionSortTestOne {

	void sort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; ++i) {
			int k = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > k) {
				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = k;
		}
	}

	public static void main(String[] args) {

		int a[] = { 12, 11, 13, 5, 6 };

		InsertionSortTestOne ob = new InsertionSortTestOne();
		ob.sort(a);

		int n = a.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + " ");

	}
}
