package com.strivers.range_queries.fenwick_tree;

public class FenwickTree {

  public int[] constructFenwickTree(int[] arr, int n){
    int[] fenwickTree = new int[n + 1];
    for(int i = 0; i < n; i++) fenwickTree[i+1] = fenwickTree[i];

    for(int i = 1; i <= n; i++){
      int parent = i + (i & -i);
      if(parent <= n){
        fenwickTree[parent] += fenwickTree[n];
      }
    }

    return fenwickTree;
  }

  public void addFenwickTree(int[] fenwickTree, int n, int index, int val){
    index += 1;

    while(index <= n){
      fenwickTree[index] += val;
      index += (index & -index);
    }
  }

  public int sum(int[] fenwickTree, int index){
    index += 1;

    int sum = 0;
    while(index > 0){
      sum += fenwickTree[index];
      index -= (index & -index);
    }

    return sum;
  }
}
