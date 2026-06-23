package com.strivers.binary_tree.traversals;

import java.util.ArrayList;
import java.util.List;

import com.strivers.binary_tree.TreeNode;

public class Inorder {

  public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> values = new ArrayList<>();
    traverse(root, values);
    return values;
  }

  public void traverse(TreeNode root, List<Integer> values) {

    if (root == null)
      return;

    traverse(root.left, values);
    values.add(root.val);
    traverse(root.right, values);

  }

}
