package com.day7.java;

// Write a Java program to reverse a linked list using recursion

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class ReverseLinkedList {

	public static ListNode reverse(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head = reverse(head);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}
}
