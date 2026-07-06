package com.strivers.binary_tree.hard;

import com.strivers.binary_tree.TreeNode;

public class FlattenBinaryTreeToLinkedList {
  public void flatten(TreeNode root) {
    TreeNode curr = root;

    while (curr != null) {
      if (curr.left != null) {
        TreeNode temp = curr.left;
        while (temp.right != null) {
          temp = temp.right;
        }

        temp.right = curr.right;
        curr.right = curr.left;
        curr.left = null;
      }

      curr = curr.right;
    }
  }
}
