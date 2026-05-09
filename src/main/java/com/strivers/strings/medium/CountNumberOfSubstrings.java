package com.strivers.strings.medium;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfSubstrings {

  public void countNumberOfSubstrings(String s, int k) {
    System.out.println(atmostKdistinct(s, k) - atmostKdistinct(s, k - 1));
  }

  public int atmostKdistinct(String s, int k) {
    int left = 0;
    int count = 0;

    Map<Character, Integer> map = new HashMap<>();

    for (int right = 0; right < s.length(); right++) {
      map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

      while (map.size() > k) {

        char leftChar = s.charAt(left);
        map.put(leftChar, map.get(leftChar) - 1);
        if (map.get(leftChar) == 0)
          map.remove(leftChar);
        left++;
      }

      count += (right - left + 1);
    }

    return count;
  }
}
