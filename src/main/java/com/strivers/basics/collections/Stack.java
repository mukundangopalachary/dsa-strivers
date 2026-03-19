package com.strivers.basics.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

  public static void learnStack() {

    Deque<Character> stack = new ArrayDeque<>();

    stack.push('s');
    stack.push('t');
    stack.push('a');
    stack.push('c');
    stack.push('k');
    stack.push('s');
    stack.pop();
    System.out.println(stack);
    System.out.println(stack.peek());
  }
}
