package com.strivers.stacks_n_queues.infix_postfix_prefix;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class InfixToPostfix {

  public static final Map<Character, Integer> PRECEDENCE = new HashMap<>();

  static {

    PRECEDENCE.put('^', 3);

    PRECEDENCE.put('*', 2);
    PRECEDENCE.put('/', 2);
    PRECEDENCE.put('%', 2);

    PRECEDENCE.put('+', 1);
    PRECEDENCE.put('-', 1);
  }

  public String infixPostfix(String S) {

    if (S.length() <= 1)
      return S;

    Stack<Character> stack = new Stack<>();
    StringBuilder postfix = new StringBuilder();

    for (char c : S.toCharArray()) {

      // Operand
      if (Character.isLetterOrDigit(c)) {

        postfix.append(c);

      }

      // Opening bracket
      else if (c == '(') {

        stack.push(c);

      }

      // Closing bracket
      else if (c == ')') {

        while (!stack.isEmpty() && stack.peek() != '(') {
          postfix.append(stack.pop());
        }

        stack.pop(); // remove '('
      }

      // Operator
      else {

        while (!stack.isEmpty() &&
            stack.peek() != '(' &&
            (PRECEDENCE.get(stack.peek()) > PRECEDENCE.get(c)
                || (PRECEDENCE.get(stack.peek()).equals(PRECEDENCE.get(c)) && c != '^'))) {
          postfix.append(stack.pop());
        }

        stack.push(c);
      }
    }

    // Remaining operators
    while (!stack.isEmpty()) {
      postfix.append(stack.pop());
    }

    return postfix.toString();
  }
}
