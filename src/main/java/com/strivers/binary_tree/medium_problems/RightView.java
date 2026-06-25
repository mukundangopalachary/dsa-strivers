package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class RightView {

  public List<Integer> rightSideView(TreeNode root) {

    if (root == null)
      return new ArrayList<>();

    List<Integer> rightSide = new ArrayList<>();
    Deque<TreeNode> queue = new ArrayDeque<>();

    queue.offer(root);

    while (!queue.isEmpty()) {
      int size = queue.size();

      while (size-- > 0) {
        TreeNode curr = queue.poll();

        if (size == 0) {
          rightSide.add(curr.val);
        }

        if (curr.left != null) {
          queue.offer(curr.left);
        }
        if (curr.right != null) {
          queue.offer(curr.right);
        }
      }
    }

    return rightSide;
  }
}
