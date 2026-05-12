package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class EvenOddLinkedList {

  public ListNode oddEvenList(ListNode head) {

    if (head == null)
      return null;

    ListNode even = head.next;
    ListNode odd = head;
    ListNode evenHead = even;

    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      odd = odd.next;

      even.next = even.next.next;
      even = even.next;
    }

    odd.next = evenHead;

    return head;
  }
}
