package com.strivers.stacks_n_queues.learn;

public class QueueUsingArray<T> {

  private final T[] queue;
  private final int capacity;

  private int front;
  private int rear;
  private int size;

  @SuppressWarnings("unchecked")
  public QueueUsingArray(int capacity) {

    if (capacity <= 0) {
      throw new IllegalArgumentException(
          "Capacity must be greater than 0");
    }

    this.capacity = capacity;

    queue = (T[]) new Object[capacity];

    front = 0;
    rear = -1;
    size = 0;
  }

  // INSERT
  public void enqueue(T item) {

    if (isFull()) {
      throw new RuntimeException("Queue overflow");
    }

    rear = (rear + 1) % capacity;

    queue[rear] = item;

    size++;
  }

  // REMOVE
  public T dequeue() {

    if (isEmpty()) {
      throw new RuntimeException("Queue underflow");
    }

    T item = queue[front];

    // Prevent memory leak
    queue[front] = null;

    front = (front + 1) % capacity;

    size--;

    return item;
  }

  // FRONT ELEMENT
  public T peek() {

    if (isEmpty()) {
      throw new RuntimeException("Queue is empty");
    }

    return queue[front];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == capacity;
  }

  public int size() {
    return size;
  }

  public void display() {

    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }

    for (int i = 0; i < size; i++) {

      int index = (front + i) % capacity;

      System.out.print(queue[index] + " ");
    }

    System.out.println();
  }
}
