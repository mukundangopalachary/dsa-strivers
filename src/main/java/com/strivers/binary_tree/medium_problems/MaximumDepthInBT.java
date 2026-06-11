package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;

public class MaximumDepthInBT {

  public int maxDepth(TreeNode root) {
    return dfs(root);
  }

  public int dfs(TreeNode root) {

    if (root == null)
      return 0;

    int leftDepth = dfs(root.left);
    int rightDepth = dfs(root.right);

    return Math.max(leftDepth, rightDepth) + 1;
  }
}
