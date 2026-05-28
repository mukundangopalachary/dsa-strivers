package com.strivers.stacks_n_queues.infix_postfix_prefix;

import java.util.Stack;

public class PrefixToPostfix {

  public String prefixPostfix(String prefix) {
    Stack<String> stack = new Stack<>();
    int n = prefix.length() - 1;
    for (int i = n; i >= 0; i--) {
      char c = prefix.charAt(i);
      if (Character.isLetterOrDigit(c)) {
        stack.push(String.valueOf(c));
      } else {
        String op1 = stack.pop();
        String op2 = stack.pop();

        stack.push(op1 + op2 + c);
      }
    }

    return stack.peek();
  }
}
