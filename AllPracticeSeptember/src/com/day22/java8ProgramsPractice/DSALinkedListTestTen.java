package com.day22.java8ProgramsPractice;

// A Linked List is a linear data structure where
// each element (node) contains data and a 
// reference to the next node

class NodeTen {
	int data;
	NodeTen next;

	NodeTen(int d) {
		data = d;
		next = null;
	}
}

public class DSALinkedListTestTen {

	public static void main(String[] args) {

		NodeTen head = new NodeTen(10);
		head.next = new NodeTen(20);
		head.next.next = new NodeTen(30);

		NodeTen temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}
}
