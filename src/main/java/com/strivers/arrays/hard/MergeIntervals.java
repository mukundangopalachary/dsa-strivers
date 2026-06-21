package com.strivers.arrays.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeIntervals {

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> arr = new ArrayList<>();

    int[] current = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
      if (current[1] >= intervals[i][0]) {
        current[1] = Math.max(current[1], intervals[i][1]);
      } else {
        arr.add(current);
        current = intervals[i];
      }
    }

    arr.add(current);

    return arr.toArray(new int[arr.size()][]);
  }
}
