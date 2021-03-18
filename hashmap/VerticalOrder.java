package com.chitkara.hashmap;

import java.util.*;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class VerticalOrder {

	static TreeMap<Integer, TreeMap<Integer, Integer>> store;

	static void putInMap(Node curr, int vLevel, int hLevel) {
		TreeMap<Integer, Integer> currM = store.getOrDefault(vLevel, new TreeMap<>());
		currM.put(hLevel, curr.data);
		store.put(vLevel, currM);
	}

	static void verticalOrder(Node root, int vLevel, int hLevel) {
		if (root == null) {
			return;
		}

		putInMap(root, vLevel, hLevel);

		verticalOrder(root.right, vLevel + 1, hLevel + 1);
		verticalOrder(root.left, vLevel - 1, hLevel + 1);
	}

	public static void topView(Node root) {
		store = new TreeMap<>();

		verticalOrder(root, 0, 0);

		for (Map.Entry<Integer, TreeMap<Integer, Integer>> pair : store.entrySet()) {
			TreeMap<Integer, Integer> vM = pair.getValue();
			System.out.print(vM.get(vM.firstKey()) + " ");
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		topView(root);
	}
}