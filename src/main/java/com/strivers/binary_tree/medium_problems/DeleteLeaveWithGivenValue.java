package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;

public class DeleteLeaveWithGivenValue {

  public TreeNode removeLeafNodes(TreeNode root, int target) {
    TreeNode dummy = new TreeNode(0);
    dummy.left = root;

    dfs(root, target, dummy, 0);

    return dummy.left;
  }

  public void dfs(TreeNode root, int target, TreeNode prev, int dir) {
    if (root == null)
      return;

    dfs(root.left, target, root, 0);
    dfs(root.right, target, root, 1);

    if (root.val == target && root.left == null && root.right == null) {
      if (dir == 0)
        prev.left = null;
      else
        prev.right = null;
    }
  }
}
