package com.chitkara.binarytree;

import java.util.*;

public class LevelOrder {
	static List<List<Integer>> printLevels(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null)
			return ans;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			List<Integer> currL = new ArrayList<>();
			for (int i = 0; i < q.size(); i++) {
				TreeNode front = q.remove();
				currL.add(front.val);

				if (front.left != null) {
					q.add(front.left);
				}
				if (front.right != null) {
					q.add(front.right);
				}
			}
			
			ans.add(currL);
		}

		return ans;
	}

	public static void main(String[] args) {
		TreeNode myBinaryTree = new TreeNode();
	}
}
