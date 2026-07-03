package com.strivers.binary_tree.hard;

import java.util.HashMap;
import java.util.Map;

import com.strivers.binary_tree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  int preIdx = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < inorder.length; i++) {
      map.put(inorder[i], i);
    }
    return build(preorder, map, 0, preorder.length - 1);
  }

  private TreeNode build(int[] preorder, Map<Integer, Integer> map, int left, int right) {
    if (left > right) {
      return null;
    }

    int value = preorder[preIdx++];
    TreeNode node = new TreeNode(value);
    int mid = map.get(value);
    node.left = build(preorder, map, left, mid - 1);
    node.right = build(preorder, map, mid + 1, right);

    return node;
  }
}
