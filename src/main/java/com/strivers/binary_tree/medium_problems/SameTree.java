package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;

public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    return recursion(p, q);
  }

  public boolean recursion(TreeNode p, TreeNode q) {
    if (p == null && q == null)
      return true;

    if (p == null || q == null)
      return false;

    if (p.val != q.val)
      return false;

    return recursion(p.left, q.left) && recursion(p.right, q.right);
  }
}
