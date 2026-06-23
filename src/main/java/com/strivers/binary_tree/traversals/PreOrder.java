package com.strivers.binary_tree.traversals;

import java.util.ArrayList;
import java.util.List;

import com.strivers.binary_tree.TreeNode;

public class PreOrder {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    traverse(root, list);
    return list;
  }

  public void traverse(TreeNode root, List<Integer> list) {
    if (root == null)
      return;

    list.add(root.val);
    traverse(root.left, list);
    traverse(root.right, list);
  }

}
