package com.strivers.binary_tree.hard;

import java.util.ArrayDeque;
import java.util.Deque;

import com.strivers.binary_tree.TreeNode;

public class CountTotalNodes {

  public int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    Deque<TreeNode> queue = new ArrayDeque<>();
    int count = 0;
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        TreeNode curr = queue.poll();

        if (curr.left != null)
          queue.offer(curr.left);
        if (curr.right != null)
          queue.offer(curr.right);

        count++;
        size--;
      }
    }

    return count;
  }
}
