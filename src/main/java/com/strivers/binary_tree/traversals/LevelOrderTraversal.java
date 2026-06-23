package com.strivers.binary_tree.traversals;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;

import com.strivers.binary_tree.TreeNode;

public class LevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {

    Deque<TreeNode> queue = new ArrayDeque<>();

    List<List<Integer>> list = new ArrayList<>();

    if (root == null)
      return list;

    queue.offer(root);

    while (!queue.isEmpty()) {
      List<Integer> curr = new ArrayList<>();
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        curr.add(node.val);

        if (node.left != null) {
          queue.offer(node.left);
        }

        if (node.right != null) {
          queue.offer(node.right);
        }
      }

      list.add(curr);
    }
    return list;
  }
}
