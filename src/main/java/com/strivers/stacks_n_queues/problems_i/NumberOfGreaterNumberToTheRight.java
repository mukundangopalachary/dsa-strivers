package com.strivers.stacks_n_queues.problems_i;

import java.util.Arrays;
import java.util.Stack;

public class NumberOfGreaterNumberToTheRight {

  public int[] numberOfGreaterNumberToTheRight(int[] nums) {

    Stack<Integer> st = new Stack<>();
    int n = nums.length;
    int[] res = new int[n];

    Arrays.fill(res, -1);

    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= nums[i]) {
        st.pop();
      }

      if (!st.empty()) {
        res[i] = st.peek();
      }

      st.push(nums[i]);
    }

    return res;
  }
}
