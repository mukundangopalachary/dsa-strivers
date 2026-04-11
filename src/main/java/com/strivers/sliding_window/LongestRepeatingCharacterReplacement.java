package com.strivers.sliding_window;

public class LongestRepeatingCharacterReplacement {
  public static int characterReplacement(String s, int k) {
    int[] freq = new int[26];
    int left = 0, maxFreq = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
      char curr = s.charAt(right);
      freq[curr - 'A']++;

      maxFreq = Math.max(maxFreq, freq[curr - 'A']);

      int windowSize = right - left + 1;

      // if invalid → shrink
      if (windowSize - maxFreq > k) {
        freq[s.charAt(left) - 'A']--;
        left++;
      }

      maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
  }
}
