package com.day7.java;

// Write a Java program to find the lowest common ancestor (LCA) of two nodes in a binary tree

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class LowestCommonAncestor {

	public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;
		TreeNode left = findLCA(root.left, p, q);
		TreeNode right = findLCA(root.right, p, q);
		return (left != null && right != null) ? root : (left != null ? left : right);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		TreeNode lca = findLCA(root, root.left.left, root.left.right);
		System.out.println("LCA: " + lca.val);

	}
}
