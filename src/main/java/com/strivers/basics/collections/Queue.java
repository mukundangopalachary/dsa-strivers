package com.strivers.basics.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

  public static void tryQueue() {

    Deque<Integer> queue = new ArrayDeque<>();

    queue.add(3);
    queue.add(2);
    queue.add(1);

    System.out.println(queue);

    queue.poll();
    System.out.println(queue);

    System.out.println(queue.peek());

    System.out.println(queue.isEmpty());
  }
}
