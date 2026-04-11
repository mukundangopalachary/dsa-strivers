package com.strivers.sliding_window;

import java.util.Set;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

  public static int lengthOfLongestSubstring(String s) {
    int count = 0, i = 0, j = 0;
    Set<Character> set = new HashSet<>();
    int maxCount = 0;

    while (i < s.length() && j < s.length()) {
      char ch = s.charAt(j);
      if (!set.contains(ch)) {
        count++;
        j++;
        set.add(ch);
        maxCount = Math.max(maxCount, count);
      } else {
        while (set.contains(ch) && i <= j) {
          set.remove(s.charAt(i));
          count--;
          i++;
        }
      }
    }

    return maxCount;
  }

}
