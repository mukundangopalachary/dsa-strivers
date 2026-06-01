package com.strivers.stacks_n_queues.problems_i;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

  public String removeKdigits(String num, int k) {
    Deque<Character> st = new ArrayDeque<>();

    for (char c : num.toCharArray()) {
      while (k > 0 && !st.isEmpty() && st.peekLast() > c) {
        st.pollLast();
        k--;
      }
      st.offerLast(c);
    }

    while (k > 0) {
      st.pollLast();
      k--;
    }

    StringBuilder sb = new StringBuilder();
    boolean leadingZero = true;

    for (char c : st) {
      if (leadingZero && c == '0') {
        continue;
      }
      leadingZero = false;
      sb.append(c);
    }

    return sb.length() == 0 ? "0" : sb.toString();
  }
}
