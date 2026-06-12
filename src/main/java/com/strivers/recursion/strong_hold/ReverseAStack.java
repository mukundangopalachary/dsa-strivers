package com.strivers.recursion.strong_hold;

import java.util.Stack;

public class ReverseAStack {

  public void reverse(Stack<Integer> st) {
    Stack<Integer> ans = new Stack<>();
    reverse(st, ans);
  }

  public void reverse(Stack<Integer> st, Stack<Integer> ans) {
    if (st.isEmpty())
      return;

    ans.push(st.pop());
    reverse(st, ans);
    return;
  }
}
