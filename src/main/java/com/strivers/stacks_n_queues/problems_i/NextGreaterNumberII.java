package com.strivers.stacks_n_queues.problems_i;

import java.util.Arrays;
import java.util.Stack;

class NextGreaterNumberII {
  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    Arrays.fill(res, -1);
    Stack<Integer> st = new Stack<>();

    for (int i = 2 * n - 1; i >= 0; i--) {
      int idx = i % n;
      while (!st.isEmpty() && st.peek() <= nums[idx]) {
        st.pop();
      }

      if (!st.isEmpty() && i < n) {
        res[idx] = st.peek();
      }

      st.push(nums[idx]);
    }
    return res;
  }
}
