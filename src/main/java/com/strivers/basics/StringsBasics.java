package com.strivers.basics;
import java.lang.StringBuilder; // No Thread-Safety
import java.lang.StringBuffer; // Thread-Safety


public class StringsBasics {
  
  public static void stringBasics(){
    char[] hello = {'H', 'e', 'l', 'l', 'o'};
    System.out.println(hello);
    System.out.println(new String(hello) + " World");

    StringBuilder sb = new StringBuilder();

    sb.append("Chocolate is my favourite Snack!");
    sb.delete(10, 12);

    String sb_string = sb.toString();
    System.out.println(sb_string);

    StringBuffer sB = new StringBuffer();
    sB.append("\nString BUFFER\n");

    String sB_string = sB.toString();
    System.out.println(sB_string);
  }
}
