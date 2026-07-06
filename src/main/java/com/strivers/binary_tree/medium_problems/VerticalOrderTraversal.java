package com.strivers.binary_tree.medium_problems;

import com.strivers.binary_tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class VerticalOrderTraversal {

  TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tmap;

  public List<List<Integer>> verticalTraversal(TreeNode root) {

    tmap = new TreeMap<>();

    dfs(root, 0, 0);

    List<List<Integer>> ans = new ArrayList<>();

    for (Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> colEntry : tmap.entrySet()) {

      List<Integer> curr = new ArrayList<>();

      for (Map.Entry<Integer, PriorityQueue<Integer>> rowEntry : colEntry.getValue().entrySet()) {

        PriorityQueue<Integer> pq = rowEntry.getValue();

        while (!pq.isEmpty()) {
          curr.add(pq.poll());
        }
      }

      ans.add(curr);
    }

    return ans;
  }

  private void dfs(TreeNode node, int row, int col) {

    if (node == null) return;

    tmap.computeIfAbsent(col, k -> new TreeMap<>())
        .computeIfAbsent(row, k -> new PriorityQueue<>())
        .offer(node.val);

    dfs(node.left, row + 1, col - 1);
    dfs(node.right, row + 1, col + 1);
  }
}
