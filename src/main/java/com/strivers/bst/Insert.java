package com.strivers.bst;

public class Insert {

  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null)
      return new TreeNode(val);
    insert(root, val, null);
    return root;
  }

  public void insert(TreeNode root, int val, TreeNode prev) {
    if (root == null) {
      if (prev.val > val) {
        prev.left = new TreeNode(val);
        return;
      } else {
        prev.right = new TreeNode(val);
        return;
      }
    }

    if (root.val > val) {
      insert(root.left, val, root);
    } else {
      insert(root.right, val, root);
    }
  }
}
