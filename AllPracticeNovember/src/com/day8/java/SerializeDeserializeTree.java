package com.day8.java;

import java.util.*;

// Write a Java program to serialize and deserialize a binary tree

class TreeNodethree {
	int val;
	TreeNodethree left, right;

	TreeNodethree(int val) {
		this.val = val;
	}
}

public class SerializeDeserializeTree {

	public static String serialize(TreeNodethree root) {
		if (root == null)
			return "null";
		Queue<TreeNodethree> queue = new LinkedList<>();
		queue.add(root);
		StringBuilder sb = new StringBuilder();

		while (!queue.isEmpty()) {
			TreeNodethree node = queue.poll();
			if (node == null) {
				sb.append("null,");
			} else {
				sb.append(node.val).append(",");
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return sb.toString();
	}

	public static TreeNodethree deserialize(String data) {
		if (data.equals("null"))
			return null;
		String[] values = data.split(",");
		Queue<TreeNodethree> queue = new LinkedList<>();
		TreeNodethree root = new TreeNodethree(Integer.parseInt(values[0]));
		queue.add(root);

		for (int i = 1; i < values.length; i++) {
			TreeNodethree node = queue.poll();
			if (!values[i].equals("null")) {
				node.left = new TreeNodethree(Integer.parseInt(values[i]));
				queue.add(node.left);
			}
			if (!values[++i].equals("null")) {
				node.right = new TreeNodethree(Integer.parseInt(values[i]));
				queue.add(node.right);
			}
		}
		return root;
	}

	public static void main(String[] args) {

		TreeNodethree root = new TreeNodethree(1);
		root.left = new TreeNodethree(2);
		root.right = new TreeNodethree(3);
		root.right.left = new TreeNodethree(4);
		root.right.right = new TreeNodethree(5);
		
		String serialized = serialize(root);
		System.out.println("Serialized: " + serialized);
		TreeNodethree deserialized = deserialize(serialized);
		System.out.println("Deserialized Root: " + deserialized.val);

	}
}
