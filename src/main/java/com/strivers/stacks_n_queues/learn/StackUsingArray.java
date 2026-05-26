package com.strivers.stacks_n_queues.learn;

public class StackUsingArray<T> {

  private T[] stack;
  private int capacity;
  private int topIndex;

  @SuppressWarnings("unchecked")
  public StackUsingArray(int size) {
    if (size <= 0)
      throw new IllegalArgumentException("There cannot be size less than or equal to zero");

    capacity = size;
    stack = (T[]) new Object[capacity];
    topIndex = -1;
  }

  public StackUsingArray() {
    this(1000);
  }

  public void push(T item) {
    if (isFull())
      throw new RuntimeException("Stack overflow");
    stack[++topIndex] = item;
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack underflow");
    }

    T item = stack[topIndex];
    stack[topIndex--] = null;
    return item;
  }

  public T peek() {
    if (isEmpty())
      throw new RuntimeException("Stack underflow");
    return stack[topIndex];
  }

  public boolean isEmpty() {
    return topIndex == -1;

  }

  public boolean isFull() {
    return topIndex == capacity - 1;
  }
}
