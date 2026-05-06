package com.strivers.strings.basics_easy;

public class IsomorphicString {

  public boolean isIsomorphic(String s, String t) {
    int[] m1 = new int[256];
    int[] m2 = new int[256];
    int n = s.length();

    for (int i = 0; i < n; i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      if (m1[charS] != m2[charT]) {
        return false;
      }

      m1[charS] = i + 1;
      m2[charT] = i + 1;
    }

    return true;
  }
}
