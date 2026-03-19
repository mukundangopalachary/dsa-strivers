package com.strivers.basics.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class LinkNode {
  int val;
  LinkNode next;

  LinkNode() {
  }

  LinkNode(int val) {
    this.val = val;
  }

  LinkNode(int val, LinkNode next) {
    this.val = val;
    this.next = next;
  }

}

public class DynamicList {

  public static void arrayList() {

    // ArrayList
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(20);

    list.remove(0);
    list.add(133);

    for (int num : list) {
      System.out.print(String.valueOf(num) + " ");
    }
    System.out.println(list);

    // LinkedList(Collections)

    List<Integer> linkedList = new LinkedList<>();
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(10);

    System.out.print("LinkedList: ");
    System.out.println(linkedList);

    linkedList.remove(1);
    List<Integer> linkedCompare = new LinkedList<>(Arrays.asList(3, 10));
    System.out.println(linkedList.equals(linkedCompare));
  }
}
