package com.strivers.stacks_n_queues.learn;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingQueue {
  Deque<Integer> stack;

  public StackUsingQueue() {
    stack = new ArrayDeque<>();
  }

  public void push(int x) {
    stack.addFirst(x);
  }

  public int pop() {
    return stack.removeFirst();
  }

  public int top() {
    return stack.peekFirst();
  }

  public boolean empty() {
    return stack.isEmpty();
  }
}
