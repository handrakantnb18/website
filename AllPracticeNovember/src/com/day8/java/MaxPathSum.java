package com.day8.java;

// Write a Java program to find the maximum path sum in a binary tree

class TreeNodeone {
	int val;
	TreeNodeone left, right;

	TreeNodeone(int val) {
		this.val = val;
	}
}

public class MaxPathSum {

	private static int maxSum = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNodeone root) {
		calculateSum(root);
		return maxSum;
	}

	private static int calculateSum(TreeNodeone node) {
		if (node == null)
			return 0;
		int leftSum = Math.max(0, calculateSum(node.left));
		int rightSum = Math.max(0, calculateSum(node.right));
		
		maxSum = Math.max(maxSum, leftSum + rightSum + node.val);
		return node.val + Math.max(leftSum, rightSum);
	}

	public static void main(String[] args) {

		TreeNodeone root = new TreeNodeone(-10);
		root.left = new TreeNodeone(9);
		root.right = new TreeNodeone(20);
		root.right.left = new TreeNodeone(15);
		root.right.right = new TreeNodeone(7);
		
		System.out.println("Maximum path sum: " + maxPathSum(root));

	}
}
