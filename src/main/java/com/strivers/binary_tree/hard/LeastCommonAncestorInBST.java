package com.strivers.binary_tree.hard;

import com.strivers.binary_tree.TreeNode;

public class LeastCommonAncestorInBST {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return dfs(root, p, q);
  }

  public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null)
      return null;

    TreeNode left = dfs(root.left, p, q);
    TreeNode right = dfs(root.right, p, q);

    if (root == p) {
      return p;
    }

    if (root == q) {
      return q;
    }

    if (left != null && right != null)
      return root;

    if (left != null)
      return left;
    else
      return right;
  }
}
