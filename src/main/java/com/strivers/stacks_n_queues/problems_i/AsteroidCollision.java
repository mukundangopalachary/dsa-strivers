package com.strivers.stacks_n_queues.problems_i;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {

  public int[] asteroidCollision(int[] asteroids) {
    Deque<Integer> st = new ArrayDeque<>();

    for (int ast : asteroids) {
      if (ast > 0) {
        st.push(ast);
      } else {
        while (!st.isEmpty() && st.peek() > 0 && st.peek() < -ast) {
          st.pop();
        }

        if (!st.isEmpty() && st.peek() == -ast) {
          st.pop();
        } else if (st.isEmpty() || st.peek() < 0)
          st.push(ast);
      }
    }

    int[] res = new int[st.size()];
    for (int i = st.size() - 1; i >= 0; i--) {
      res[i] = st.pop();
    }

    return res;
  }
}
