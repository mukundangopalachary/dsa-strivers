package com.strivers.recursion.subsequence;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class LetterCombinationsOfPhoneNumber {

  public List<String> letterCombinations(String digits) {
    List<String> list = new ArrayList<>();
    Map<Character, String> digitToLetters = new HashMap<>();
    digitToLetters.put('2', "abc");
    digitToLetters.put('3', "def");
    digitToLetters.put('4', "ghi");
    digitToLetters.put('5', "jkl");
    digitToLetters.put('6', "mno");
    digitToLetters.put('7', "pqrs");
    digitToLetters.put('8', "tuv");
    digitToLetters.put('9', "wxyz");
    backtrack(list, new StringBuilder(), digits, 0, digitToLetters);
    return list;
  }

  public void backtrack(List<String> list, StringBuilder curr, String digits, int idx,
      Map<Character, String> digitToLetters) {
    if (idx == digits.length()) {
      list.add(curr.toString());
      return;
    }

    String l = digitToLetters.get(digits.charAt(idx));
    for (char c : l.toCharArray()) {
      curr.append(c);
      backtrack(list, curr, digits, idx + 1, digitToLetters);
      curr.deleteCharAt(curr.length() - 1);
    }
  }
}
