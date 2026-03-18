package com.strivers;

import com.strivers.basics.InputOutput;
import com.strivers.basics.ArraysIntroduction;
import com.strivers.basics.SwitchCase;
import com.strivers.basics.patterns.pattern_2;
import com.strivers.basics.patterns.pattern_3;
import com.strivers.basics.patterns.pattern_4;
import com.strivers.basics.StringsBasics;
import com.strivers.basics.IfElseIf;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to strivers list!!\n");

    InputOutput.tryInput();
    ArraysIntroduction.tryArrayIntroduction();
    IfElseIf.tryIfElse();
    SwitchCase.trySwitchCase(5);
    StringsBasics.stringBasics();
    pattern_2.pattern2();
    pattern_3.pattern3();
    pattern_4.pattern4();
  }
}
