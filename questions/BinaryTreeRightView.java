package com.chitkara.questions;

import com.chitkara.binarytree.TreeNode;
import java.util.*;

public class BinaryTreeRightView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> l = new ArrayList<>();
		if (root == null) {
			return l;
		}

		Deque<TreeNode> q = new ArrayDeque<>();
		q.add(root);

		while (!q.isEmpty()) {
			l.add(q.peekLast().val);
			
			for (int i = 0; i < q.size(); i++) {
				TreeNode curr = q.remove();
				
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		return l;
	}

	public static void main(String[] args) {

	}
}
