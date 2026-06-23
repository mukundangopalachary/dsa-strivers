package com.strivers.binary_tree.traversals;

import java.util.ArrayList;
import java.util.List;
import com.strivers.binary_tree.TreeNode;

public class PostOrder {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    dfs(root, list);
    return list;
  }

  public void dfs(TreeNode root, List<Integer> list) {
    if (root == null)
      return;

    dfs(root.left, list);
    dfs(root.right, list);
    list.add(root.val);
  }
}
