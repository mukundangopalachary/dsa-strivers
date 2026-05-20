package com.strivers.linkedlist.singlyLL.problems.hard;

import com.strivers.linkedlist.singlyLL.ListNode;

public class RotateList {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0)
      return head;
    int n = 1;
    ListNode end = head;

    while (end.next != null) {
      n++;
      end = end.next;
    }

    k = k % n;
    if (k == 0)
      return head;

    end.next = head;

    int len = n - k;
    ListNode newEnd = head;

    for (int i = 1; i < len; i++) {
      newEnd = newEnd.next;
    }

    ListNode newHead = newEnd.next;
    newEnd.next = null;

    return newHead;
  }
}
