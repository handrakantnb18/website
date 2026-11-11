package com.day8.java;

// Write a Java program to find the kth smallest element in a binary search tree

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class KthSmallestInBST {

	private static int count = 0;
	private static int result = Integer.MIN_VALUE;

	public static int kthSmallest(TreeNode root, int k) {
		inOrder(root, k);
		return result;
	}

	private static void inOrder(TreeNode node, int k) {
		if (node == null)
			return;
		inOrder(node.left, k);
		if (++count == k) {
			result = node.val;
			return;
		}
		inOrder(node.right, k);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		System.out.println("2nd smallest element: " + kthSmallest(root, 2));

	}
}
