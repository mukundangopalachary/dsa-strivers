package com.strivers.stacks_n_queues.problems_i;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerNumber {

  public int[] nextSmallerNumber(int[] nums) {

    Stack<Integer> st = new Stack<>();
    int[] res = new int[nums.length];
    Arrays.fill(res, -1);

    for (int i = nums.length - 1; i >= 0; i--) {

      while (!st.empty() && st.peek() >= nums[i]) {
        st.pop();
      }

      if (!st.isEmpty()) {
        res[i] = nums[i];
      }

      st.push(nums[i]);

    }

    return res;
  }
}
