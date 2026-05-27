package com.strivers.stacks_n_queues.learn;

import java.util.Stack;

public class MinStack {

  Stack<Integer> stack;
  Stack<Integer> minStack;

  public MinStack() {
    stack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int val) {
    stack.push(val);
    int min = val;
    if (!minStack.isEmpty() && minStack.peek() < val) {
      min = minStack.peek();
    }
    minStack.push(min);
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  
}
