package com.strivers.binary_tree.hard;

import java.util.HashMap;
import java.util.Map;

import com.strivers.binary_tree.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

  int postIdx;
  Map<Integer, Integer> map;

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    map = new HashMap<>();
    int n = postorder.length;
    postIdx = n - 1;

    for (int i = 0; i < n; i++) {
      map.put(inorder[i], i);
    }

    return build(postorder, 0, n - 1);
  }

  public TreeNode build(int[] postorder, int left, int right) {
    if (left > right)
      return null;

    int rootValue = postorder[postIdx--];
    TreeNode node = new TreeNode(rootValue);
    int mid = map.get(rootValue);

    node.right = build(postorder, mid + 1, right);
    node.left = build(postorder, left, mid - 1);

    return node;
  }
}
