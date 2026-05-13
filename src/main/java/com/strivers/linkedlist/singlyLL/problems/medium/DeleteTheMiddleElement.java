package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class DeleteTheMiddleElement {

  public ListNode deleteMiddle(ListNode head) {

    if (head == null || head.next == null)
      return null;

    ListNode slow = head;
    ListNode fast = head.next.next;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;

    return head;
  }
}
