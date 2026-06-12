package com.strivers.recursion.strong_hold;

import java.util.Stack;

public class SortStackUsingRecursion {

  public void sort(Stack<Integer> st) {
    sortStack(st);
  }

  public static void sortStack(Stack<Integer> st) {
    if (!st.isEmpty()) {
      int top = st.pop();

      // Sort the remaining stack
      sortStack(st);

      // Insert the popped element back in sorted position
      sortedInsert(st, top);
    }
  }

  private static void sortedInsert(Stack<Integer> st, int ele) {
    if (!st.isEmpty() && st.peek() <= ele) {
      st.push(ele);
      return;
    }

    int top = st.pop();
    sortedInsert(st, ele);

    st.push(top);
  }
}
