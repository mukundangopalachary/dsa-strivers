package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;

    while (curr != null) {
      ListNode next = curr.next;

      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
