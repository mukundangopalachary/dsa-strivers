package com.strivers.recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

  public List<List<String>> partition(String s) {
    List<List<String>> list = new ArrayList<>();
    List<String> curr = new ArrayList<>();
    dfs(list, curr, s);
    return list;
  }

  public void dfs(List<List<String>> list, List<String> curr, String s) {
    if (s == null | s.length() == 0) {
      list.add(new ArrayList<>(curr));
      return;
    }

    for (int i = 1; i <= s.length(); i++) {
      String temp = s.substring(0, i);
      if (!palindrome(temp))
        continue;

      curr.add(temp);
      dfs(list, curr, s.substring(i, s.length()));
      curr.remove(curr.size() - 1);
    }
  }

  public boolean palindrome(String temp){
    int i = 0;
    int j = temp.length() - 1;

    while(i <= j){
      if(temp.charAt(i) != temp.charAt(j)){
        return false;
      }
      i++;
      j--;
    }

    return true;
  
}
