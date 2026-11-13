package com.day8.java;

// Write a Java program to validate a binary search tree

class TreeNodetwo {
	int val;
	TreeNodetwo left, right;

	TreeNodetwo(int val) {
        this.val = val;
    }
}

public class ValidateBST {

	public static boolean isValidBST(TreeNodetwo root) {
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean validate(TreeNodetwo node, long min, long max) {
		if (node == null)
			return true;
		if (node.val <= min || node.val >= max)
			return false;
		return validate(node.left, min, node.val) && validate(node.right, node.val, max);
	}

	public static void main(String[] args) {

		TreeNodetwo root = new TreeNodetwo(2);
		root.left = new TreeNodetwo(1);
		root.right = new TreeNodetwo(3);
		
		System.out.println("Is valid BST: " + isValidBST(root));

	}
}
