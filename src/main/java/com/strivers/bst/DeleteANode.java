package com.strivers.bst;

public class DeleteANode {

  public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;
    return delNode(root, key);
  }

  public TreeNode getSuccessor(TreeNode node) {
    TreeNode curr = node.right;

    while (curr.left != null) {
      curr = curr.left;
    }

    return curr;
  }

  public TreeNode delNode(TreeNode node, int key) {
    if (node == null) return null;

    if (node.val < key) {
      node.right = delNode(node.right, key);
    } else if (node.val > key) {
      node.left = delNode(node.left, key);
    } else {
      if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }

      TreeNode succ = getSuccessor(node);
      node.val = succ.val;
      node.right = delNode(node.right, succ.val);
    }

    return node;
  }
}
