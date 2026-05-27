package com.strivers.stacks_n_queues.learn;

import java.util.Stack;

public class QueueUsingStack {

  private Stack<Integer> input;
  private Stack<Integer> output;

  public QueueUsingStack() {
    input = new Stack<>();
    output = new Stack<>();
  }

  // enqueue
  public void push(int x) {
    input.push(x);
  }

  // move elements only when needed
  private void transfer() {
    if (output.isEmpty()) {
      while (!input.isEmpty()) {
        output.push(input.pop());
      }
    }
  }

  // dequeue
  public int pop() {
    transfer();
    return output.pop();
  }

  // front element
  public int peek() {
    transfer();
    return output.peek();
  }

  public boolean empty() {
    return input.isEmpty() && output.isEmpty();
  }
}
