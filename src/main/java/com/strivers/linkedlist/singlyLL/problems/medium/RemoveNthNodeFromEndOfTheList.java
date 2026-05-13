package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class RemoveNthNodeFromEndOfTheList {
  public ListNode removeNthFromEnd(ListNode head, int n) {

    if (head == null)
      return null;

    ListNode ptr = head;
    int count = 0;
    while (ptr != null) {
      count++;
      ptr = ptr.next;
    }

    int target = count - n;
    if (target == 0)
      return head.next;

    ptr = head;

    for (int i = 0; i < target - 1; i++) {
      ptr = ptr.next;
    }

    ptr.next = ptr.next.next;
    return head;
  }
}
