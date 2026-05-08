package com.strivers.strings.medium;

import java.util.List;
import java.util.ArrayList;
public class MaximumNestingDepthOfTheParentheses {

  public int maxDepth(String s) {
    List<Character> stack = new ArrayList<>();
    int count = 0;
    int maxCount = 0;
    for(char c: s.toCharArray()){
      if(c=='('){
        stack.add(c);
        count++;
        maxCount = Math.max(count, maxCount);
      }else {
        if(c == ')' && !stack.isEmpty()){
          stack.remove(stack.size()- 1);
          count--;
        }
      }
    }

    return maxCount;
  }
}
