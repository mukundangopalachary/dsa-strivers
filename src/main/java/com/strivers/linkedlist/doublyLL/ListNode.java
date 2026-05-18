package com.strivers.linkedlist.doublyLL;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode prev;

  ListNode() {
    val = 0;
    next = null;
    prev = null;
  }

  ListNode(int data1) {
    val = data1;
    next = null;
    prev = null;
  }

  ListNode(int data1, ListNode next1, ListNode prev1) {
    val = data1;
    next = next1;
    prev = prev1;
  }
}
