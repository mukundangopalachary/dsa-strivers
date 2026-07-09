package com.strivers.bst;

public class PreOrderToBST {

  public TreeNode bstFromPreorder(int[] preorder) {
    if (preorder.length == 1) return new TreeNode(preorder[0]);

    TreeNode root = null;
    for (int i = 0; i < preorder.length; i++) {
      root = insert(root, preorder[i]);
    }

    return root;
  }

  public TreeNode insert(TreeNode node, int val) {
    if (node == null) return new TreeNode(val);

    if (node.val > val) {
      node.left = insert(node.left, val);
    } else node.right = insert(node.right, val);

    return node;
  }
}
