package com.strivers.strings.basics_easy;

public class RotateString {

  public boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) return false;
    int[] lps = new int[goal.length()];
    constructLps(lps, goal);

    int i = 0, j = 0;
    String text = s+s;
    
    while(i<text.length()){
      if(text.charAt(i) == goal.charAt(j)){
        i++;
        j++;
      }

      if(j == goal.length()){
        return true;
      }else if(i < text.length() && text.charAt(i) != goal.charAt(j)){
        if(j!=0){
          j = lps[j - 1];
        }else{
          i++;
        }
      }
    }

    return false;
  }

  public void constructLps(int[] lps, String goal){
    
    int len = 0;
    int i = 1;
    lps[0] = 0;

    while(i < goal.length()){
      if(goal.charAt(i) == goal.charAt(len)){
        lps[i++] = ++len;
      }else{
        if(len!=0){
          len = lps[len - 1];
        }else{
          lps[i++] = 0;
        }
      }
    }

  }
}
