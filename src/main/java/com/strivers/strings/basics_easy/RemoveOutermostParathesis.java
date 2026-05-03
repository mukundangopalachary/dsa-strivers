package com.strivers.strings.basics_easy;

public class RemoveOutermostParathesis {

  public String removeOuterParentheses(String s) {
    int n = s.length();
    if (n <= 2)
      return "";

    StringBuilder sb = new StringBuilder();
    int open = 0;

    for (char c : s.toCharArray()) {
      if (c == '(') {
        // If open > 0, this '(' is inside an outer parenthesis
        if (open > 0)
          sb.append('(');
        open++;
      } else {
        // Decrement first; if open > 1, this ')' is inside an outer parenthesis
        open--;
        if (open > 0)
          sb.append(')');
      }
    }

    return sb.toString();
  }
}
