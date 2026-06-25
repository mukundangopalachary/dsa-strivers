package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class ZizZag {

  class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      if (root == null)
        return new ArrayList<>(new ArrayList<>());

      List<List<Integer>> zz = new ArrayList<>();
      Deque<TreeNode> queue = new ArrayDeque<>();
      int depth = 1;

      queue.offer(root);

      while (!queue.isEmpty()) {
        List<Integer> currList = new ArrayList<>();
        int size = queue.size();

        while (size-- > 0) {

          if (depth % 2 != 0) {
            TreeNode curr = queue.pollFirst();
            currList.add(curr.val);

            if (curr.left != null)
              queue.offerLast(curr.left);
            if (curr.right != null)
              queue.offerLast(curr.right);
          } else {
            TreeNode curr = queue.pollLast();
            currList.add(curr.val);
            if (curr.left != null)
              queue.offerFirst(curr.left);
            if (curr.right != null)
              queue.offerFirst(curr.right);
          }

        }
        depth++;

        zz.add(currList);
      }

      return zz;
    }
  }
}
