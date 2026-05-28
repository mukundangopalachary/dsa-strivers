package com.strivers.stacks_n_queues.infix_postfix_prefix;

import java.util.Stack;

public class PostfixToInfix {

  public String postfixInfix(String postfix) {

    Stack<String> stack = new Stack<>();

    for (char c : postfix.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        stack.push(String.valueOf(c));
      } else {
        String op1 = stack.pop();
        String op2 = stack.pop();

        stack.push("(" + op2 + c + op1 + ")");
      }
    }

    return stack.peek();
  }
}
