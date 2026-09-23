package com.day23.java8ProgramsPractice;

//A Tree is a hierarchical data structure with nodes
// connected by edges. The top node is the root

class NodeEleven {
	int data;
	NodeEleven left, right;

	NodeEleven(int val) {
		data = val;
		left = right = null;
	}
}

public class DSATreeTestEleven {

	static void inorder(NodeEleven root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void main(String[] args) {

		NodeEleven root = new NodeEleven(1);
		root.left = new NodeEleven(2);
		root.right = new NodeEleven(3);
		root.left.left = new NodeEleven(4);

		inorder(root);

	}
}
